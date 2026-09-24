package output;

public class SpeakerOutput implements AudioOutput {

   public void makeSound(String sound) {
        System.out.println("Playing " + sound + " through speakers");
    }
}
