---
layout: default
course_number: CS330
title: "Homework: Chapter 1"
---

## Chapter 1 Homework

### Problem 1 (15 pts)
Consider a single router transmitting packets, each of length _L_ bits, over a single link with transmission rate _R_ Mbps to another router at the other end of the link. Suppose that the packet length is _L = 16000 bits_, and that the link transmission rate along the link to router on the right is _R = 1000 Mbps_. Round your answer to two decimals after leading zeros.
  - Compute the _one-hop_ transmission delay
  - What is the maximum number of packets per second that can be transmitted by this link?

### Problem 2 (25 pts)
Consider a network with three links, each with the specified transmission rate and link length. Link 1 transmission rate is _100 Mbps_ with length of _3 Km_. Link 2 transmission rate is _10 Mbps_ and length _5000 Km_, Link 3 transmission rate is _100 Mbps_ and length is _1 Km_. The packet we are trying to send has a length of _4000 bits_. The speed of light is _3*10<sup>8</sup> m/sec_. Round your answers to two decimals after leading zeros.
  - Calculate the transmission and propagation delays for Link 1, 2 and 3.
  - What is the end to end delay for the packet?

### Problem 3 (10 pts)
Consider sending a packet from a source host to a destination host over a fixed route.
  - List the delay components in the <b>end-to-end</b> delay.
  - Which of these delays are constant and which are variable?

### Problem 4 (45 pts)
Consider the two scenarios below:

A circuit-switching scenario in which _N<sub>cs</sub>_ users, each requiring a bandwidth of _25 Mbps_, must share a link of capacity _100 Mbps_.
A packet-switching scenario with _N<sub>ps</sub>_ users sharing a _100 Mbps_ link, where each user again requires _25 Mbps_ when transmitting, but only needs to transmit _30 %_ of the time. Round your answer to two decimals after leading zeros.

  - When circuit switching is used, what is the maximum number of users that can be supported?
  - When packet switching is used, if there are 7 packet-switching users, can this many users be supported under circuit-switching?
  - If there are 7 packet-switching users, what is the probability that a given user is transmitting, and the remaining users are not transmitting?
  - What is the probability that one user (any one among the 7 users) is transmitting, and the remaining users are not transmitting?
  - When one user is transmitting, what fraction of the link capacity will be used by this user? Write your answer as a decimal number.
  - When packet switching is used, what is the probability that any 3 users (of the total 7 users) are transmitting and the remaining users are not transmitting?
  - When packet switching is used, what is the probability that more than 4 users are transmitting?

### Problem 5 (5 pts)
What layer in the TCP/IP stack best corresponds to saying: 'handles messages from a variety of network applications'?

### Submit

Post your solutions in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus.
