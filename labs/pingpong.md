---
layout: default
course_number: CS330
title: "Programming Lab: UDP Ping Pong"
---

### Programming Lab

In this programming assignment, you will write a client ping program in Java. Your client will send a simple _ping_ message to a server,
receive a corresponding _pong_ message back from the server, and determine the delay between when the client sent the ping message and received the pong message.
This delay is called the Round Trip Time (RTT). The functionality provided by the client and server is similar to the functionality provided by standard ping program available in modern operating systems.
However, standard ping programs use the Internet Control Message Protocol (_ICMP_). Java does not provide a straightforward means to interact with ICMP.
In this exercise we will create a nonstandard (but simple) UDP-based ping pong program.

### Objectives:
  - Your ping program is to send 10 ping messages to the target server over UDP.
  - For each message, your client is to determine and print the RTT when the corresponding pong message is returned.
  - Because UDP is an unreliable protocol, a packet sent by the client or server may be lost. For this reason, the client cannot wait indefinitely for a reply to a ping message. You should have the client wait up to one second for a reply from the server; if no reply is received, the client should assume that the packet was lost and print a message accordingly.

### Notes
  - In this assignment, you will be given the complete code for the [PingServer](files\PingServer.java). Your job is to write the client code, which will be very similar to the server code.

### Extra Credit
- In addition to RTT, the client should also report the minimum, maximum and the average RTT’s at the end of all pings from the client.
- Calculate and display the packet loss rate.
- The standard _ping_ program sends exactly one ping per second, modify the client to mimic the original _ping_ behavior (instead of sending new ping immediately when it receives a reply). Feel free to use the _Timer_ and _TimerTask_ classes in _java.util_.

### References
- [DatagramSocket](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/net/DatagramSocket.html)
- [DatagramPacket](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/net/DatagramPacket.html)
- [Timer](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Timer.html)
- [TimerTask](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/TimerTask.html)

### Submit
Post your source in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus. I may ask you to demo your program to me.
