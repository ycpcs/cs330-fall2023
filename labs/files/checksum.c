// Computing the Internet Checksum
// https://datatracker.ietf.org/doc/html/rfc1071

unsigned short checksum (unsigned short *data, int len)
{
   unsigned short *w = data;
   int nleft = len;
   int sum = 0;
   unsigned short chksum=0;

   while (nleft > 1)  {
       sum += *w++;
       nleft -= 2;
   }

   if (nleft == 1) {
        *(unsigned char *)(&chksum) = *(unsigned char *)w;
        sum += chksum;
   }

   sum = (sum >> 16) + (sum & 0xffff);
   sum += (sum >> 16);
   chksum = (unsigned short)(~sum);

   return chksum;
}
