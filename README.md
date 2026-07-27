# MusicPlayer

This repository contains a music player written in Java programming language, created as a personal project to learn Java and Swing API.

### Command to compile all project tree in Windows PowerShell

To compile the project use this PowerShell command in your terminal interface:

```bash
> javac -cp "lib/*" -d bin (Get-ChildItem -Recurse -Filter *.java).FullName
```

### Command to execute the project after compile

To execute the project after compile, use this PowerShell command in yout terminal interface:

```bash
> java -cp "bin;lib/*" musicplayer.MusicPlayer
```
