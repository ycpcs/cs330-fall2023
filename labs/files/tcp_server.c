#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <ctype.h>

void main()
{   
    int sock;
    if ((sock = socket(PF_INET, SOCK_STREAM, 0)) < 0)
    {
        perror("Socket error\n");
        return;
    }
    
    int reuse = 1;
    if (setsockopt(sock, SOL_SOCKET, SO_REUSEADDR, &reuse, sizeof(reuse)) == -1) {
        perror("setsockopt error\n");
        return;
    }

    struct sockaddr_in server;
    struct sockaddr_in client;
    int sockaddr_size = sizeof(struct sockaddr_in);
    memset(&server, 0x00, sizeof(server));

    server.sin_family = AF_INET;
    server.sin_addr.s_addr = htonl(INADDR_ANY);
    server.sin_port = htons(8080);

    if (bind(sock, (struct sockaddr *)&server, sizeof(server)) < 0)
    {
        printf("Bind error");
        return;
    }

    listen(sock, 5);
    printf("listening....\n");

    char msg[50];
    memset(msg, 0x00, sizeof(msg));

    while (1)
    {
        int client_sock = accept(sock, (struct sockaddr *)&client, &sockaddr_size);
        printf("Connected to %s:%i\n", inet_ntoa(client.sin_addr), ntohs(client.sin_port));

        if (recv(client_sock, msg, sizeof(msg) - 1, 0) < 0)
        {
            perror("Receive failure\n");
            close(client_sock);
            continue;
        }

        printf("%s\n", msg);

        for (int i = 0; i < sizeof(msg); i++)
        {
            msg[i] = toupper(msg[i]);
        }

        if (sendto(client_sock, msg, strlen(msg), 0, (struct sockaddr *)&client, sockaddr_size) < 0)
        {
            perror("Send failure\n");
            close(client_sock);
            continue;
        }

        close(client_sock);
    }
    close(sock);
}
