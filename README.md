# Samex
## What is it?
Samex is a command line utility program.
## Prerequisites
* Python(For interactive help)(not required if interactive help not needed)
* Java(To run Samex)
## Installation
 # with terminal
 * [navigate to installation folder]
 * java SamexInstaller
 # with git
 * git clone https://github.com/Dfmaaa/Samex
 * cd Samex
 * java SamexInstaller
 ## If you don't have Java
 * [navigate to installation folder]
 * cd Inst*
 * [run the file for your OS.]
## Usage
 * step 1: [navigate to installation folder]
 * step 2: java Samex
 * step 3:(again)java Samex
### some accepted arguments
 * --reset
 * --uninstall
 * --update
## Updating
 * step 1:[navigate to installation folder]
 * step 2:java Updates
## Deletion
* [navigate to installation folder]
* java Uninstall 
## What happens if SamexRun is runned
 so far, only one feature doesn't work. restart, because SamexRun runs commands with a while loop,(from 3.0), and when the restart command is runned, the while loop breaks, and the main file(Samex), is also running a while loop that keeps using the run() method, without the main file, restart wont work because after the while loop breaks, the program will stop. shutdown uses System.exit to stop the program, that stops everything.
## Encryption algorithm used for passwords
  SHA-256 is used for passwords.
### What did the earlier versions use?
The first Samex password algorithm was... nothing, just stored plaintext passwords, that was replaced with a substitution cipher, then I tried to make the substitution cipher stronger by repeating the process ascii(key.charAt(0)) times. That was also weak. The current version uses SHA-256.
