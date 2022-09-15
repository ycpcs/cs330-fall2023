---
layout: default
course_number: CS330
title: "Programming Lab - Introduction to Sockets"
---

# Programming Lab - Introduction to Sockets

### Download and compile _individually_ the following files:
  - [tcp_client.c](files/tcp_client.c)
  - [udp_client.c](files/udp_client.c)
  - [tcp_server.c](files/tcp_server.c)
  - [udp_server.c](files/udp_server.c)

- Compile with: ```gcc tcp_client.c -o tcp_client```
- Run with: ```./tcp_client```

### We use the following simple client/server applications do demonstrate UDP and TCP socket programming.
  - A client reads a line from its standard input and sends the line out its socket to the server.
  - The server reads a line from its socket.
  - The server converts the line to uppercase.
  - The server sends the modified line out its socket to the client.
  - The client reads the modified line through its socket and prints the line on its standard output.

### Run the applications and answer the following questions:
  - Suppose you run `tcp_client` before you run `tcp_server`.
    - What happens?
    - Why?
  - Suppose you run `udp_client` before you run `udp_server`.
    - What happens?
    - Why?
  - What happens if you use different port numbers for the UDP client and UDP server sides?
  - What happens if you use different port numbers for the TCP client and TCP server sides?
  - Run `udp_server` and `udp_client` – send a message. Run `udp_client` again (while `udp_server` is still running), but this time with a shorter message.
    - What happens?
    - Why?
    - Fix it.
  - Update tcp_client, udp_client, tcp_server and udp_server to accept the **client and server** port numbers as an _user_ input.
  - Update tcp_client and udp_client to accept the **server** IP Address as an _user_ input.
  - Change the _send_msg_ in udp_client to allocate 5 bytes instead of 50. Run the udp_client and the udp_server – send a message with length more than 5.
    - What happens?
    - Why?
  - Change the allocation size of _recv_msg_ in udp_client to 5 and rerun the client.
    - What do you expect will happen?
    - What happens?  
    - Why?
 - _Extra Credit_ Experiment with the code, surprise me.
    - Do not be afraid to explore and break it. Learn from it.  

### References
  - [Linux socket interface](https://linux.die.net/man/7/socket)
  - [Beej's Guide to Network Programming](https://beej.us/guide/bgnet/html/)

### Testing
  - [Netcat](http://netcat.sourceforge.net/) is a command line tool that connects to an arbitrary TCP or UDP port and allows you to send and receive data.

### Grading
Post your report __including source__ in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus.
