---
layout: default
course_number: CS330
title: "Lab - Notes"
---

#### Upgrade VM 
- ```sudo apt update``` - downloads package information from all configured sources.
- ```sudo apt upgrade``` - will upgrade all installed packages to their latest versions.
- ```sudo apt-get autoremove``` - deletes orphaned packages, or dependencies that remain installed after you have installed an application and then deleted it.
- ```sudo apt-get clean``` - removes all packages from the cache.

#### Install Editors
- Sublime: ```sudo snap install sublime-text --classic```  
- Visual Studio Code: ```sudo snap install --classic code```

#### Install Wireshark 
- ```sudo apt-get install wireshark```
- ```sudo dpkg-reconfigure wireshark-common```
- ```sudo adduser $USER wireshark```

#### Install Python 
- ```sudo apt-get install python3```
  - Run a webserver: ```python3 -m http.server 8000```