package player;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import output.AudioOutput;
@ApplicationScoped
public class SimpleMusicPlayer implements MusicPlayer {

private final AudioOutput audioOutput;
@Inject
public SimpleMusicPlayer(AudioOutput audioOutput){
   this.audioOutput = audioOutput;
}

    @Override
    public void playSong(String song) {
        audioOutput.makeSound(song);
    }
}
