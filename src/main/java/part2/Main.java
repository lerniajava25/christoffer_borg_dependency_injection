package part2;

import player.SimpleMusicPlayer;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        PlayerContainer container = new PlayerContainer();

        SimpleMusicPlayer player =
                (SimpleMusicPlayer) container.playerContainer(SimpleMusicPlayer.class);

        player.playSong("Master of puppets");
    }
}
