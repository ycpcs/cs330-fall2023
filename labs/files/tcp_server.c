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
    struct sockaddr_in server;
    struct sockaddr_in client;
    int sockaddr_size = sizeof(struct sockaddr_in);

    int sock;
    if ((sock = socket(PF_INET, SOCK_STREAM, 0)) < 0)
    {
        perror("Socket error\n");
        return;
    }

    memset(&server, 0x00, sizeof(server));

    server.sin_family = AF_INET; // IPv4
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

        recv(client_sock,
             msg,
             sizeof(msg) - 1,
             0);

        printf("%s\n", msg);

        for (int i = 0; i < sizeof(msg); i++)
        {
            msg[i] = toupper(msg[i]);
        }

        sendto(client_sock,
               msg,
               strlen(msg),
               0,
               (struct sockaddr *)&client,
               sockaddr_size);

        close(client_sock);
    }
    close(sock);
}
