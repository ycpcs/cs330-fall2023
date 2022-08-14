#include <stdio.h> 
#include <string.h>
#include <sys/socket.h>  
#include <netinet/ip.h>  

void main()
{
	int sock;
    if((sock = socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP)) < 0 ){
        perror("Socket error\n");
        return;
    }

    struct sockaddr_in server;
    struct sockaddr_in client;
    int sockaddr_size = sizeof(struct sockaddr_in);
    memset((char*)&client, 0x00, sizeof(client));
	memset((char*)&server, 0x00, sizeof(server));    
	server.sin_family = AF_INET; // IPv4
    server.sin_addr.s_addr = htonl(INADDR_ANY);
    server.sin_port = htons(8080);
    
    if(bind(sock, (struct sockaddr_in*)&server, sizeof(server)) < 0 ){
    	printf("Bind error\n");
    	return;
    }

    printf("listening....\n");

    char msg[50];
    memset(msg, 0x00, sizeof(msg));
    while(1){        
    	recvfrom(sock, 
            msg, 
            sizeof(msg), 
            0, 
            (struct sockaddr_in*) &client, 
            &sockaddr_size);
        
        printf("%s\n", msg);

        for(int i = 0; i < sizeof(msg); i++){
            msg[i] = toupper(msg[i]);
        }

        sendto(sock, 
            msg, 
            strlen(msg), 
            0, 
            (struct sockaddr_in*) &client, 
            sockaddr_size);
    }
}