package part1;

import output.SpeakerOutput;
import player.SimpleMusicPlayer;

public class Main {
    public static void main(String[] args) {
        SpeakerOutput speaker = new SpeakerOutput();
        SimpleMusicPlayer player = new SimpleMusicPlayer(speaker);
        player.playSong("Enter Sandman");
    }
}
