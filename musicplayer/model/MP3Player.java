package musicplayer.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javazoom.jlgui.basicplayer.BasicPlayer;

public class MP3Player {
    private BasicPlayer player;
    private ExecutorService executor;

    public MP3Player() {
        this.player = new BasicPlayer();
        this.executor = Executors.newSingleThreadExecutor();
    }

    public void play(Music music) {
        executor.execute(() -> {
            try {
            player.open(music.getFile());
            player.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void pause() {
        try {
            player.pause();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resume() {
        try {
            player.resume();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}