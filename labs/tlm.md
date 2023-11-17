---
layout: default
course_number: CS330
title: "Programming Assignment: Three Letter Match"
---

## Three Letter Match
Modify _tcp_client_ and _tcp_server_ programs to play the word game: Three Letter Match. The basic idea is to select a three letter set and then see how many "legal" words you can think of that contain that three letter substring.

#### Here are the rules:

  - The client chooses a __three letter set__ (substring) which it sends to the server. Substrings should consist of letters only (no numbers, symbols, etc.) and case should not matter.
  - The server will access a dictionary of [words](files/words.txt), which it will use to determine if guesses made by clients are valid.
  - Clients will then send words that they believe contain the substring to the server. The server will verify two things: first, that it is a legal word (it is in the dictionary), and two, that the substring does exist in the word.
  - If the client sends a valid word that contains the substring, the client is awarded one point. If the substring does not exist in the word or the word is not in the dictionary (or both), the client loses one point.
  - When the client can no longer think of any words containing the substring, it can send a _List_ command so the server will send back a list of all words in the dictionary containing that substring.
  - Before terminating, the client's total score should be displayed.
  - Commands should be read from standard input and display results on standard output.
  - The server should not exit until it is explicitly told to do so.
  - This should be a menu-driven application with the commands
    - __Set__ to pick the substring
    - __Submit__ to submit a word to the server to see if the word is in the dictionary and if the substring exists in that word
    - __List__ to get all words in the dictionary that contain the current set of letters as a substring
    - __Quit__ to stop playing the game and print the client's current score
  - No client buffers should be larger than __512 bytes__.

### Notes
You will need to make some design decisions. (For example: How will you handle multiple clients? How will you keep the client score? Will you allow a client to continue making guesses after a List command has been given? What if a client sends a 2 or a 4-letter substring instead of a 3-letter one?). You should include in your documentation (see below) what these design decisions were and why you chose to handle them as you did. In addition, ALL code should be well documented -- you will lose points if it is not.

Include comments in your source code indicating where, why, and how the original source code was modified. Also, include a README file, with instructions as to how your code is to be used.

You may work on this assignment in pairs. If you work in pairs: Submit only ONE set of program files, making sure both names are on each.

#### Code snippets
  - [tcp_client.c](files/tcp_client.c)
  - [tcp_server.c](files/tcp_server.c)

### References
  - [Linux socket interface](https://linux.die.net/man/7/socket)
  - [Beej's Guide to Network Programming](https://beej.us/guide/bgnet/html/)
  - [Debugging with GDB](https://ftp.gnu.org/old-gnu/Manuals/gdb/html_node/gdb_toc.html)
  - Create a child process [fork](https://linux.die.net/man/2/fork)

### Testing
  - [Netcat](http://netcat.sourceforge.net/) is a command line tool that connects to an arbitrary TCP or UDP port and allows you to send and receive data.

### Grading
Post your report including source in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus.

- Readme File
- Compile 
- Run
  - Menu
  - Set -> Submit -> List -> Quit
  - Consecutive runs (Set after List)
  - Correct Score
- Multiple Clients 
- Buffer Sizes < 512
- Basic Error Handling 
  - Set with fewer than 3 characters
  - Set with more than 3 characters
  - Set with invalid substring
  - Multiple Set Commands
  - Submit after List
  - Submit the same word multiple times
- Test with _ate_ substring


<!-- 

cat words.txt | perl -nlE '$_=lc; $l=length; next if $l < 3; m/(.{3,$l})(?{ $freq{$1}++ })^/; END { say "$freq{$_} $_" for keys %freq }' | sort -rg | head -10

 -->

