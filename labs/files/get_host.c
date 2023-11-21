// #include <netdb.h> // for host resolution
void get_host(const char *hostname, char *ip)
{
    struct hostent *host;
    host = gethostbyname(hostname);
    if (host != NULL)
    {
        strcpy(ip, inet_ntoa(*(struct in_addr *)host->h_addr));
    }
}