package musicplayer.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javazoom.jlgui.basicplayer.BasicPlayer;

public class MP3Player {
    private BasicPlayer player;
    private ExecutorService executor;

    public MP3Player() {
        player = new BasicPlayer();
        executor = Executors.newSingleThreadExecutor();
    }

}