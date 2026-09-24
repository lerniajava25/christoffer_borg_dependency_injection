package player;

import output.AudioOutput;

public class SimpleMusicPlayer implements MusicPlayer {

private AudioOutput audioOutput;

public SimpleMusicPlayer(AudioOutput audioOutput){
   this.audioOutput = audioOutput;
}

    @Override
    public void playSong(String song) {
        audioOutput.makeSound(song);
    }
}
