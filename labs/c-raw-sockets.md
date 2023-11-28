---
layout: default
course_number: CS330
title: "Programming Assignment: Ping and Traceroute using C raw sockets"
---

### Background
  - ICMP is used by hosts and routers to communicate network-layer information to each other. The most typical use of ICMP is to send error messages and operational information indicating, for example, that a requested service is not available or that a host or router could not be reached.
  - ICMP differs from transport protocols such as TCP and UDP in that it is not typically used to exchange data between systems, nor is it regularly employed by end-user network applications (except for some diagnostic tools like _ping_ and _traceroute_).
  - ICMP is often considered part of IP but architecturally it lies just above IP, as ICMP messages are carried inside IP datagrams – meaning ICMP messages are carried as IP payload, just as TCP or UDP segments are carried as IP payload.

### Objective
  - The goal of this lab is to get familiar with low level network programming by implementing the 2 most popular network utilities - _ping_ and _traceroute_. Since this assignment will be using C raw sockets, you need to run your program with root privileges.
  - ALL code should be well documented -- you will lose points if it is not. Also, you might choose to include a README file, with instructions as to how your code is to be used.

### Ping
  - Your ping program is to send 10 _ICMP_ ping messages to a target server. The target server needs to an input to your program.
  - For each message, your client is to determine and print the RTT when the corresponding response message is returned.
  - Because the network might be unreliable, a packet sent by the client or server may be lost. For this reason, the client cannot wait indefinitely for a reply to a ping message. You should have the client wait up to _two_ second for a reply from the server; if no reply is received, the client should assume that the packet was lost and print a message accordingly.

### Traceroute
  - Update your completed _ping_ program to complete a _traceroute_ program.
  - Traceroute works by sending packets to the destination host, starting with a time to live (ttl) of 1, and incrementing it after every hop until a reply is received from destination host.
  - When the _n_<sup>th</sup> datagram arrives at the _n_<sup>th</sup> router, the _n_<sup>th</sup> router observes that the TTL of the datagram has just expired.
  - According to the rules of the IP protocol, the router discards the datagram and sends an ICMP warning message to the source (type 11 code 0).
  - This warning message includes the name of the router and its IP address. When this ICMP message arrives back at the source, the source obtains the round-trip time from the timer and the name and IP address of the nth router from the ICMP message.
  - How does a traceroute know when to stop sending ICMP segments? When the source host receives ICMP message with type 0 and code 0, it knows it does not need to send additional probe packets.

### Code snippets
  - [checksum.c](files/checksum.c)
  - [get_host.c](files/get_host.c)

### References
  - [RFC 792](http://tools.ietf.org/html/rfc792)
  - [Beej's Guide to Network Programming](https://beej.us/guide/bgnet/html/)
  - [Linux socket interface](https://linux.die.net/man/2/socket). Don't forget to use SOCK_RAW type.
  - [Sends a message to a host](https://linux.die.net/man/3/sendto)
  - [Receive a message from a socket](https://linux.die.net/man/3/recvfrom)
  - Get the IPv4 address corresponding to a given Internet host name: [gethostbyname](https://www.man7.org/linux/man-pages/man3/gethostbyname.3.html)
  - Convert a socket address to a corresponding host: [getnameinfo](https://www.man7.org/linux/man-pages/man3/getnameinfo.3.html)
  - Set Socket Options: [setsockopt](https://linux.die.net/man/3/setsockopt)
    - Example of setting TTL (time to live): ```setsockopt(sock, IPPROTO_IP, IP_TTL, &ttl, sizeof(int))```

### Extra Credit
  - In addition to RTT, the output should also report the minimum, maximum and the average RTT’s at the end of all pings from the program.
  - Calculate and display the packet loss rate.
  - The standard ping program sends exactly one ping per second, modify the client to mimic the original ping behavior (instead of sending new ping immediately when it receives a reply).

### Testing
  - Wireshark will be your friend.

### Grading
Post your report including source in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus.
