#include <stdio.h>
#include <string.h>
#include <sys/socket.h>
#include <netinet/ip.h>
#include <arpa/inet.h>
#include <unistd.h>

void main()
{
    char send_msg[50];

    printf("Enter a value: ");
    fgets(send_msg, sizeof(send_msg), stdin);

    int sock;
    if ((sock = socket(PF_INET, SOCK_STREAM, 0)) < 0)
    {
        perror("Socket error\n");
        return;
    }

    struct sockaddr_in dest;
    int sockaddr_size = sizeof(struct sockaddr_in);
    memset(&dest, 0x00, sizeof(dest));

    dest.sin_family = AF_INET;
    dest.sin_addr.s_addr = inet_addr("127.0.0.1");
    dest.sin_port = htons(8080);

    if (connect(sock, (struct sockaddr *)&dest, sockaddr_size) < 0)
    {
        perror("Connection failure\n");
        close(sock);
        return;
    }

    if (send(sock, send_msg, strlen(send_msg), 0) < 0)
    {
        perror("Send failure\n");
        close(sock);
        return;
    }

    printf("Message sent. Waiting to hear back from server ....\n");

    char recv_msg[50];
    memset(recv_msg, 0x00, sizeof(recv_msg));

    if (recv(sock, recv_msg, sizeof(recv_msg), 0) < 0)
    {
        perror("Receive failure\n");
        close(sock);
        return;
    }

    printf("%s\n", recv_msg);
    close(sock);
}
