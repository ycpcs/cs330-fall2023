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
    if ((sock = socket(PF_INET, SOCK_DGRAM, 0)) < 0)
    {
        perror("Socket error\n");
        return;
    }

    struct sockaddr_in server;
    struct sockaddr_in client;
    int sockaddr_size = sizeof(struct sockaddr_in);
    memset((char *)&client, 0x00, sizeof(client));
    memset((char *)&server, 0x00, sizeof(server));
    server.sin_family = AF_INET; // IPv4
    server.sin_addr.s_addr = htonl(INADDR_ANY);
    server.sin_port = htons(8080);

    if (bind(sock, (struct sockaddr *)&server, sizeof(server)) < 0)
    {
        printf("Bind error\n");
        return;
    }

    printf("listening....\n");

    char msg[50];
    memset(msg, 0x00, sizeof(msg));
    while (1)
    {
        recvfrom(sock,
                 msg,
                 sizeof(msg),
                 0,
                 (struct sockaddr *)&client,
                 &sockaddr_size);

        printf("%s\n", msg);

        for (int i = 0; i < sizeof(msg); i++)
        {
            msg[i] = toupper(msg[i]);
        }

        sendto(sock,
               msg,
               strlen(msg),
               0,
               (struct sockaddr *)&client,
               sockaddr_size);
    }
}
