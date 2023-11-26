---
layout: default
course_number: CS330
title: Resources
---

This page contains links to useful resources.

Development Environment
------------------------------------
- Microsoft  [Visual Studio](https://visualstudio.microsoft.com/) is an integrated development environment from Microsoft. It is used to develop computer programs, as well as websites, web apps, web services and mobile apps.
- [GCC](https://gcc.gnu.org/), the GNU Compiler Collection.
- [GDB](https://www.gnu.org/software/gdb/), the GNU Project Debugger.
- [Apache NetBeans](https://netbeans.org/) Quickly and easily develop desktop, mobile, and web applications
with Java, JavaScript, HTML5, PHP, C/C++ and more.

Passive Capture
------------------------------------
- [Wireshark](https://www.wireshark.org/) is the most popular tool for passive packet capture and analysis.
    - [Sample Captures](https://gitlab.com/wireshark/wireshark/-/wikis/SampleCaptures)
    - [Filter Manual Pages](https://www.wireshark.org/docs/man-pages/wireshark-filter.html)
- [Microsoft Message Analyzer](https://docs.microsoft.com/en-us/message-analyzer/microsoft-message-analyzer-operating-guide) is an extensible tool for analyzing network.
traffic on Windows. *Retired on November 25, 2019.*
- [TCPDump & libpcap](http://www.tcpdump.org/) is a powerful command-line packet analyzer; and libpcap, a portable C/C++ library for network traffic capture, and it's windows implementation [WinPcap](https://www.winpcap.org/).
  - Programming with [pcap](http://www.tcpdump.org/pcap.htm) by Tim Carstens.
- [netwox](http://www.cis.syr.edu/~wedu/Teaching/cis758/netw522/netwox-doc_html/) is a **netw**ork toolb**ox** is a network _toolbox_ for network administrators and network hackers.
- [netwib](http://www.cis.syr.edu/~wedu/seed/Labs/Lab_Setup/netw522/) is a <b>netw</b>ork l<b>ib</b>rary is a network _library_, for network administrators and network hackers.
  - netwox already contains several tools using the netwib network library.
- [netwag](http://www.cis.syr.edu/~wedu/seed/Labs/Lab_Setup/netw522/netwag-doc_html/) is a graphical front end for netwox.
  - netwox & netwag [Troubleshooting guide](docs\netwox.pdf).
- [NetworkMiner](https://www.netresec.com/?page=NetworkMiner) is an open source Network Forensic Analysis Tool.
- [tcptrace](https://linux.die.net/man/1/tcptrace) is a tool for analysis of TCP dump files.
- [tcpflow](https://github.com/simsong/tcpflow) is a powerful command line based tool for analyzing network traffic. 

Active Capture
------------------------------------
- The [Canape tool](https://github.com/ctxis/canape) as a generic network protocol man-in-the-middle testing, analyzing, and exploitation tool with a usable GUI.
- [Canape Core](https://github.com/tyranid/CANAPE.Core/releases/) is a stripped-down fork of the original Canape code base, are designed for use from the command line.
- [Mallory](https://github.com/intrepidusgroup/mallory/) is an extensible man-in-the-middle tool that acts as a network gateway, which
makes the process of capturing, analyzing, and modifying traffic transparent to the application being tested.

Network Connectivity
------------------------------------
- The [Hping](http://www.hping.org/) tool is similar to the traditional ping utility, but it supports more than just ICMP echo requests.
- [Netcat](http://netcat.sourceforge.net/) is a command line tool that connects to an arbitrary TCP or UDP port and allows you to send and receive data.
  - Netcat cheat sheet [pocket reference guide](docs/netcat_cheat_sheet_v1.pdf).
- If you need to scan the open network interface on a remote system, nothing is better than [Nmap](https://nmap.org/).
- _netdiscover_ is a network address discovering tool, install by using `sudo apt-get install netdiscover`.
- [Masscan](https://github.com/robertdavidgraham/masscan/) is the world's fastest internet port scanner.
- [curl](https://curl.se/) is a command line tool and library for transferring data with URLs (since 1998).
- [wget](https://www.gnu.org/software/wget/) is a free software package for retrieving files using HTTP, HTTPS, FTP and FTPS.
- [HTTPie—aitch-tee-tee-pie](https://httpie.io/) is a user-friendly command-line HTTP client for the API era.

Web Testing (Web Proxies)
------------------------------------
- [Burp or Burp Suite](https://portswigger.net/burp) is the gold standard of commercial web application–testing tools.
- OWASP Zed Attack Proxy [ZAP](https://www.zaproxy.org/).
- [w3af](http://w3af.org/) is a Web Application Attack and Audit Framework.
- [mitmproxy](https://mitmproxy.org/) is an interactive, SSL/TLS-capable intercepting proxy with a console interface for HTTP/1, HTTP/2, and WebSockets.
- [Charles](https://www.charlesproxy.com/) is an HTTP proxy, an HTTP.
monitor, and a reverse proxy. It enables you to view HTTPS traffic.
- [HTTrack](https://www.httrack.com/) website copier.
- 
Network Spoofing
------------------------------------
- [Ettercap](https://www.ettercap-project.org/) is a man-in-the-middle tool designed to listen to network traffic between two devices.
- [DNSMasq](https://thekelleys.org.uk/dnsmasq/doc.html) is designed to quickly set up basic network services, such as DNS and DHCP, so you don’t have to hassle with complex service configuration
- [arpspoof](https://github.com/alandau/arpspoof) is a simple ARP spoofer for Windows.

System Utilities
------------------------------------
- [Sysinternals Suite](https://docs.microsoft.com/en-us/sysinternals/) is a suite of more than 70 freeware utilities used to monitor, manage and troubleshoot the Windows operating system.
- [NirSoft](https://www.nirsoft.net/) is a unique collection of small and useful utilities, including password recovery, networking tools, forensics and more.

API Development
------------------------------------
- [Postman](https://www.getpostman.com/) API development environment.
- [Fiddler](https://www.telerik.com/fiddler) is free web debugging proxy for any browser, system or platform.
- [A RESTful Tutorial](https://www.restapitutorial.com/).

Supplemental Material
------------------------------------
- [Interactive Exercises](http://gaia.cs.umass.edu/kurose_ross/interactive/)
- [High Performance Browser Networking](https://hpbn.co/) is what every web developer should know about networking and web performance.
- [Eloquent JavaScript](https://eloquentjavascript.net/) is a book about JavaScript, programming, and the wonders of the digital.
- [Beej's Guide to Network Programming](https://beej.us/guide/bgnet/html)
- [Principles of chaos engineering](https://principlesofchaos.org/)
- [Programmable Web](https://www.programmableweb.com/) - retired. 

Repositories
-----------------------------------
- [BIND 9](https://gitlab.isc.org/isc-projects/bind9) source code and issues.

References
-----------------------------------
- [Root Servers Map](https://root-servers.org/)
- [IANA](https://www.iana.org/) - Internet Assigned Numbers Authority
- [Service Name and Transport Protocol Port Number Registry](https://www.iana.org/assignments/service-names-port-numbers/service-names-port-numbers.xhtml)
- CERN 2019 [WorldWideWeb](https://worldwideweb.cern.ch/browser/) Rebuild
- [The CERT Division](https://www.sei.cmu.edu/about/divisions/cert/index.cfm) at Carnegie Mellon University
- [Assigned Internet Protocol Numbers](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
- [IEEE 802.3](http://www.ieee802.org/3/) - ETHERNET WORKING GROUP
- [Internet Corporation for Assigned Names and Numbers](http://www.icann.org/)

Technical Documentation
-----------------------------------
##### HTTP
  - [RFC 2617](https://tools.ietf.org/html/rfc2617), HTTP Authentication: Basic and Digest Access Authentication
  - [RFC 7230](https://tools.ietf.org/html/rfc7230), HTTP/1.1: Message Syntax and Routing
  - [RFC 7231](https://tools.ietf.org/html/rfc7231), HTTP/1.1: Semantics and Content
  - [RFC 7232](https://tools.ietf.org/html/rfc7232), HTTP/1.1: Conditional Requests
  - [RFC 7233](https://tools.ietf.org/html/rfc7233), HTTP/1.1: Range Requests
  - [RFC 7234](https://tools.ietf.org/html/rfc7234), HTTP/1.1: Caching
  - [RFC 7235](https://tools.ietf.org/html/rfc7235), HTTP/1.1: Authentication
  - [RFC 7540](https://tools.ietf.org/html/rfc7540), HTTP/2
  - [draft-ietf-quic-http](https://tools.ietf.org/html/draft-ietf-quic-http-23), HTTP/3

##### SMTP
  - [RFC 2920](https://tools.ietf.org/html/rfc2920), SMTP: Service Extension for Command Pipelining (STD 60)
  - [RFC 3030](https://tools.ietf.org/html/rfc3030), SMTP: Service Extensions for Transmission of Large and Binary MIME Messages
  - [RFC 3207](https://tools.ietf.org/html/rfc3207), SMTP: Service Extension for Secure SMTP over Transport Layer Security
  - [RFC 3461](https://tools.ietf.org/html/rfc3461), SMTP: Service Extension for Delivery Status Notifications
  - [RFC 4954](https://tools.ietf.org/html/rfc4954), SMTP: Service Extension for Authentication
  - [RFC 5321](https://tools.ietf.org/html/rfc5321), Simple Mail Transfer Protocol
  - [RFC 6531](https://tools.ietf.org/html/rfc6531), SMTP: Extension for Internationalized Email Addresses

##### IMAP
  - [RFC 3501](https://tools.ietf.org/html/rfc3501), IMAP version 4 revision 1

##### POP3
  - [RFC 1939](https://tools.ietf.org/html/rfc1939), Post Office Protocol - Version 3

##### DNS
  - [RFC 1034](https://tools.ietf.org/html/rfc1034), Domain Names - Concepts and Facilities
  - [RFC 1035](https://tools.ietf.org/html/rfc1035), Domain Names - Implementation and Specification
  - [RFC 1123](https://tools.ietf.org/html/rfc1123), Requirements for Internet Hosts—Application and Support
  - [RFC 1995](https://tools.ietf.org/html/rfc1995), Incremental Zone Transfer in DNS
  - [RFC 2136](https://tools.ietf.org/html/rfc2136), DNS UPDATE
  - [RFC 3225](https://tools.ietf.org/html/rfc3225), Indicating Resolver Support of DNSSEC
  - [RFC 3226](https://tools.ietf.org/html/rfc3226), DNSSEC and IPv6 A6 aware server/resolver message size requirements
  - [RFC 3596](https://tools.ietf.org/html/rfc3596), DNS Extensions to Support IP Version 6
  - [RFC 7858](https://tools.ietf.org/html/rfc7858), Specification for DNS over Transport Layer Security (TLS)
  - [RFC 8310](https://tools.ietf.org/html/rfc8310), Usage Profiles for DNS over TLS and DNS over DTLS
  - [RFC 8484](https://tools.ietf.org/html/rfc8484), DNS Queries over HTTPS (DoH)

##### FTP
  - [RFC 959](https://tools.ietf.org/html/rfc959), FILE TRANSFER PROTOCOL (FTP)

##### P2P
  - [RFC 5694](https://tools.ietf.org/html/rfc5694), Peer-to-Peer (P2P) Architecture

##### TCP
  - [RFC 793](https://tools.ietf.org/html/rfc793), TCP v4
  - [STD 7](https://tools.ietf.org/html/std7), Transmission Control Protocol, Protocol specification
  - [RFC 1122](https://tools.ietf.org/html/rfc1122), Requirements for Internet Hosts -- Communication Layers
  - [RFC 1948](https://tools.ietf.org/html/rfc1948), Defending Against Sequence Number Attacks
  - [RFC 2018](https://tools.ietf.org/html/rfc2018), TCP Selective Acknowledgment Options
  - [RFC 3168](https://tools.ietf.org/html/rfc3168), The Addition of Explicit Congestion Notification (ECN) to IP
  - [RFC 5681](https://tools.ietf.org/html/rfc5681), TCP Congestion Control
  - [RFC 6298](https://tools.ietf.org/html/rfc6298), Computing TCP's Retransmission Timer
  - [RFC 6824](https://tools.ietf.org/html/rfc6824), TCP Extensions for Multipath Operation with Multiple Addresses
  - [RFC 7323](https://tools.ietf.org/html/rfc7323), TCP Extensions for High Performance
  - [RFC 7414](https://tools.ietf.org/html/rfc7414), A Roadmap for TCP Specification Documents
  - [RFC 8312](https://tools.ietf.org/html/rfc8312), CUBIC for Fast Long-Distance Networks

##### UDP
  - [RFC 768](https://tools.ietf.org/html/rfc768), User Datagram Protocol
  - [RFC 2675](https://tools.ietf.org/html/rfc2675), IPv6 Jumbograms
  - [RFC 4113](https://tools.ietf.org/html/rfc4113), Management Information Base for the UDP
  - [RFC 8085](https://tools.ietf.org/html/rfc8085), UDP Usage Guidelines

##### IP
  - [RFC 791](https://tools.ietf.org/html/rfc791),  INTERNET PROTOCOL
  - [RFC 950](https://tools.ietf.org/html/rfc950), Internet Standard Subnetting Procedure
  - [RFC 1349](https://tools.ietf.org/html/rfc1349), Type of Service in the Internet Protocol Suite
  - [RFC 1958](https://tools.ietf.org/html/rfc1958), Architectural Principles of the Internet
  - [RFC 1517](https://tools.ietf.org/html/rfc1517), Applicability Statement for the Implementation of Classless Inter-Domain Routing (CIDR)
  - [RFC 1633](https://tools.ietf.org/html/rfc1633), Integrated Services in the Internet Architecture: an Overview
  - [RFC 2460](https://tools.ietf.org/html/rfc2460), Internet Protocol, Version 6 (IPv6) Specification
  - [RFC 2473](https://tools.ietf.org/html/rfc2473), Generic Packet Tunneling in IPv6 Specification
  - [RFC 2474](https://tools.ietf.org/html/rfc2474), Definition of the Differentiated Services Field (DS Field) in the IPv4 and IPv6 Headers
  - [RFC 2475](https://tools.ietf.org/html/rfc2475), An Architecture for Differentiated Services
  - [RFC 3056](https://tools.ietf.org/html/rfc3056), Connection of IPv6 Domains via IPv4 Clouds (6to4)
  - [RFC 3439](https://tools.ietf.org/html/rfc3439), Some Internet Architectural Guidelines and Philosophy
  - [RFC 4380](https://tools.ietf.org/html/rfc4380), Teredo: Tunneling IPv6 over UDP
  - [FCC-15-24](https://www.fcc.gov/document/fcc-releases-open-internet-order), FCC Releases Open Internet Order

##### ICMP
  - [RFC 792](https://tools.ietf.org/html/rfc792), INTERNET CONTROL MESSAGE PROTOCOL
  - [RFC 1070](https://tools.ietf.org/html/rfc1071), Computing the Internet Checksum
  - [RCF 1122](https://tools.ietf.org/html/rfc1122), Requirements for Internet Hosts - Communication Layers

##### DHCP
  - [RFC 951](https://tools.ietf.org/html/rfc951), BOOTSTRAP PROTOCOL (BOOTP)
  - [RFC 2131](https://tools.ietf.org/html/rfc2131), Dynamic Host Configuration Protocol
  - [RFC 2132](https://tools.ietf.org/html/rfc2132), DHCP Options and BOOTP Vendor Extensions
  - [RFC 3046](https://tools.ietf.org/html/rfc3046), DHCP Relay Agent Information Option
  - [RFC 3397](https://tools.ietf.org/html/rfc3346), Dynamic Host Configuration Protocol (DHCP) Domain Search Option
  - [RFC 3942](https://tools.ietf.org/html/rfc3942), Reclassifying Dynamic Host Configuration Protocol Version Four (DHCPv4) Options
  - [RFC 4242](https://tools.ietf.org/html/rfc4242), Information Refresh Time Option for Dynamic Host Configuration Protocol for IPv6
  - [RFC 4361](https://tools.ietf.org/html/rfc4361), Node-specific Client Identifiers for Dynamic Host Configuration Protocol Version Four (DHCPv4)
  - [RFC 4436](https://tools.ietf.org/html/rfc4436), Detecting Network Attachment in IPv4 (DNAv4)

##### BGP
  - [RFC 1771](https://tools.ietf.org/html/rfc1771), A Border Gateway Protocol 4 (BGP-4)
  - [RFC 1965](https://tools.ietf.org/html/rfc1965), Autonomous System Confederations for BGP
  - [RFC 1997](https://tools.ietf.org/html/rfc1997), BGP Communities Attribute
  - [RFC 2547](https://tools.ietf.org/html/rfc2547), BGP/MPLS VPNs
  - [RFC 2796](https://tools.ietf.org/html/rfc2796), BGP Route Reflection - An Alternative to Full Mesh IBGP
  - [RFC 2842](https://tools.ietf.org/html/rfc2842), Capabilities Advertisement with BGP-4
  - [RFC 2858](https://tools.ietf.org/html/rfc2858), Multiprotocol Extensions for BGP-4
  - [RFC 2918](https://tools.ietf.org/html/rfc2918), Route Refresh Capability for BGP-4
  - [RFC 3107](https://tools.ietf.org/html/rfc3107), Carrying Label Information in BGP-4

##### OSPF
  - [RFC2328](https://tools.ietf.org/html/rfc2328), OSPF Version 2
  - [RFC5340](https://tools.ietf.org/html/rfc5340), OSPF for IPv6

##### ARP
  - [RFC826](https://tools.ietf.org/html/rfc826), An Ethernet Address Resolution Protocol
  - [RFC5494](https://tools.ietf.org/html/rfc5494), IANA Allocation Guidelines for the Address Resolution Protocol (ARP)

##### Ethernet
  - [RFC894](https://tools.ietf.org/html/rfc894), A Standard for the Transmission of IP Datagrams over Ethernet Networks
  - [RFC1042](https://tools.ietf.org/html/rfc1042), A Standard for the Transmission of IP Datagrams over IEEE 802 Networks
