package output;

public class HeadphoneOutput implements AudioOutput {

    public void makeSound(String sound) {
        System.out.println("Playing " + sound + " through headphones");
    }
}
