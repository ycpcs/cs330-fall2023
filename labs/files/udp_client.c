#include <stdio.h> 
#include <string.h>
#include <sys/socket.h>  
#include <netinet/ip.h>  
   
void main() 
{ 
    char send_msg[50];

    printf("Enter a value: ");
    fgets(send_msg, sizeof(send_msg), stdin);

    int sock;
    if((sock = socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP)) < 0 ){
        perror("Socket failure\n");
        return;
    }

    struct sockaddr_in dest; 
    int dest_size = sizeof(dest);
    memset(&dest, 0x00, sizeof(dest));

    dest.sin_family = AF_INET; 
    dest.sin_addr.s_addr = inet_addr("127.0.0.1");
    dest.sin_port = htons(8080);

    sendto( sock, 
            send_msg, 
            strlen(send_msg), 
            0, 
            (struct sockaddr_in*) & dest, 
            dest_size);

    printf("Message sent. Waiting to hear back from server ....\n");
    
    char recv_msg[50];
    memset(recv_msg, 0x00, sizeof(recv_msg));
    recvfrom(sock, 
        recv_msg, 
        sizeof(recv_msg) - 1, 
        0, 
        &dest, 
        &dest_size);
    
    printf("%s\n", recv_msg);

    close(sock);
} 
