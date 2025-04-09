# Music Player

## Overview
This Java program demonstrates how to play audio files using the `javax.sound.sampled` package. It supports `.wav`, `.au`, and `.aiff` audio formats. The program allows users to interact with the audio playback through a simple console interface.

## Features
- Play audio files.
- Stop playback.
- Reset playback to the beginning.
- Quit the program.

## How It Works
1. The program reads an audio file from the specified file path.
2. It uses the `AudioSystem` class to load the audio file into a `Clip`.
3. Users can control playback using the following commands:
    - `P`: Play the audio.
    - `S`: Stop the audio.
    - `R`: Reset the audio to the beginning.
    - `Q`: Quit the program.

## Requirements
- Java Development Kit (JDK) 8 or higher.
- A `.wav`, `.au`, or `.aiff` audio file located at `MusicPlayer/src/Evan_Craft,_feat._KB.wav`.

## How to Run
1. Ensure the audio file exists at the specified path: `MusicPlayer/src/Evan_Craft,_feat._KB.wav`.
2. Compile and run the program:
   ```bash
   javac Main.java
   java Main