# Shell/Maven

## Learning Objectives
- [ ] Understanding the shell and its importance for Java developers
- [ ] Familiarity with basic shell commands: ls, cd, pwd, echo, mkdir, rm, mv, kill, touch
- [ ] Mastery of VIM basics: i, esc, :, q, w, u, x
- [ ] Creation and execution of shell scripts

## What is the Shell?
The shell is an interface between the user and the operating system. As a Java developer, it is important to have basic knowledge of the shell as it is useful in daily work. It allows sending commands directly to the operating system and efficiently performing tasks.

## Basic Shell Commands
- `ls`: Lists the contents of the current directory.
- `cd`: Changes the directory.
- `pwd`: Shows the current directory.
- `echo`: Displays a message.
- `mkdir`: Creates a new directory.
- `rm`: Deletes files or directories.
- `mv`: Moves files or directories.
- `kill`: Terminates processes.
- `touch`: Creates an empty file.

> 💡 Tip: The shell offers a variety of options for each command. Use the `man` pages to get more information.

## VIM Basics
VIM is a powerful text editor that can be used in the shell. Here are some important commands:
- `i`: Switch to insert mode.
- `esc`: Exit insert mode.
- `:`: Open command mode.
- `q`: Quit VIM.
- `w`: Save the document.
- `u`: Undo the last change.
- `x`: Delete the character under the cursor.

> 💡 Tip: VIM can be a bit challenging at first, but over time it becomes a powerful tool.

## Creation and Execution of Shell Scripts
Shell scripts are collections of shell commands that are executed sequentially. They allow automating complex tasks. To execute a shell script, it needs to have execution permissions.

```bash
# Beispiel für ein einfaches Shell-Skript
#!/bin/bash

echo "Hallo, Welt!"
```

The script can be made executable with the command `chmod +x script.sh` and then executed with `./script.sh`.

## Resources
- [VIM Cheat Sheet](https://vim.rtorr.com/)
- [Shell Commands Cheat Sheet](https://www.git-tower.com/blog/command-line-cheat-sheet/)
- [Maven Lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)