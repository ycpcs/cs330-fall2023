---
layout: default
course_number: CS330
title: "Homework: Chapter 2"
---
## Chapter 2 Homework

### Problem 1 (10 pts).
Suppose you wanted to do a transaction from a remote client to a server as fast as possible.  
  - Would you use FTP or HTTP? Why?
  - If you can choose the transport layer - Would you use UDP or TCP? Why?

### Problem 2 (15 pts).
Suppose the client-to-server HTTP GET message contains the following headers:
```
:authority: ycpcs.github.io
:method: GET
:path: /cs330-fall2021/schedule/index.html
:scheme: https
accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
accept-encoding: gzip, deflate, br
accept-language: en-us, en-gb;q=0.9, en;q=0.6, fr, fr-ch, zh, da, de, fi, cs
cache-control: max-age=0
dnt: 1
if-modified-since: Wed, 15 Sep 2021 23:41:10 GMT
if-none-match: W/"61428496-2bd0"
sec-ch-ua: "Google Chrome";v="93", " Not;A Brand";v="99", "Chromium";v="93"
sec-ch-ua-mobile: ?0
sec-ch-ua-platform: "Windows"
sec-fetch-dest: document
sec-fetch-mode: navigate
sec-fetch-site: none
sec-fetch-user: ?1
sec-gpc: 1
upgrade-insecure-requests: 1
user-agent: Mozilla/5.0
```
  - What is the name of the file that is being retrieved in this GET message?
  - True or False: The client will accept html files.
  - True or False: The client will accept jpeg images.
  - What is the client's preferred version of English?
  - What is the client's least preferred version of English?
  - True or False: The client will accept the German language.
  - True or False: The client already has a cached copy of the file.

### Problem 3 (15 pts).
Consider distributing a file of _F =_ 20 Gbits to _N_ peers. The server has an upload rate of _u<sub>s</sub>_ = 35 Mbps, and each peer has a download rate of _d<sub>i</sub>_ = 2 Mbps and an upload rate of _u_.
For _N_ = 10, 100, and 1,000 and _u_ = 350 Kbps, 750 Kbps, and 2 Mbps, prepare a **chart** giving the minimum distribution time for each of the combinations of _N_ and _u_ for both client-server distribution and P2P distribution.

### Problem 4 (5 pts)
What is the difference between ```MAIL FROM``` in SMTP and ```From:``` in the mail message itself?

### Problem 5 (10 pts)
Suppose you can access the caches in the local DNS servers of your department. Can you propose a way to roughly determine the Web servers (outside your department) that are most popular among the users in your department? Please explain.

### Problem 6 (5 pts)
  - What transport protocol(s) does DNS use: TCP, UDP, or Both?
  - What well-known port does DNS use?

### Problem 7 (20)
I used ftp to download a file. Use the following [ftp.pcapn](../schedule/files/ftp.pcapng) to answer the following:
  - What is my IP address?
  - What is the IP address of the FTP server?
  - What credentials I used? Is FTP secured?
  - FTP uses two TCP connections for communication. Two connections, hence two ports. The first port is the _command_ which utilizes the communication between the FTP server and the FTP client. The second one is the _data_ port where the file transfer runs. List the 2 ports, which one is the  _command_  and which one is the _data_? Provide an example of each.
  - Name the file I downloaded?
  - List the directory I found the file in?


### Submit

Post your solutions in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus.
