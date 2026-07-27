package musicplayer.model;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Music {
    private String name;
    private String filePath;

    public Music(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
    }

    public String getName() {
        return this.name;
    }

    public String getFilePath() {
        return this.filePath;
    }

    @Override
    public String toString() {
        return "Music > Name: " + this.name + " File Path: " + this.filePath;
    }

    public void play() {
        File musicFile = new File(filePath);
        try {
            BasicPlayer basicPlayer = new BasicPlayer();
            basicPlayer.open(musicFile);
            basicPlayer.play();
            Thread.sleep(15000);
            basicPlayer.pause();
        } catch (BasicPlayerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

}