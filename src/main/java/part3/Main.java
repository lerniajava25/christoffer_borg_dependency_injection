package part3;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import player.SimpleMusicPlayer;

public class Main {
    public static void main(String[] args) {
        Weld weld = new Weld();
        try (WeldContainer container = weld.initialize()) {
            SimpleMusicPlayer player = container.select(SimpleMusicPlayer.class)
                    .get();
            player.playSong("Nothing else matters");
        }

    }
}
