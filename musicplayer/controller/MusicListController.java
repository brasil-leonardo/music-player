package musicplayer.controller;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import musicplayer.model.Music;
import javazoom.jlgui.basicplayer.BasicPlayer;

public class MusicListController {
    private final Path homePath = Path.of(System.getProperty("user.home"), "Music");
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final BasicPlayer basicPlayer;

    public MusicListController() {
        basicPlayer = new BasicPlayer();
    }

    public Path getHomePath() {
        return this.homePath;
    }

    public void playMusic(String fileName) {
        File musicFile = new File(fileName);
        try {
            basicPlayer.open(musicFile);
            new Thread(() -> {
                try {
                    basicPlayer.play();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Music> getMusicsFromHome() {
        ArrayList<Music> musicList = new ArrayList<>();
        File[] musics = homePath.toFile().listFiles(file -> file.isFile() && file.getName().toLowerCase().endsWith(".mp3"));
        for (File file : musics) {
            Music music = new Music(file.getName().replace(".mp3", ""), file.getAbsolutePath());
            musicList.add(music);
        }
        return musicList;
    }

    public ArrayList<Music> getMusicsFromFolder(String path) {
        ArrayList<Music> musicList = new ArrayList<>();
        Path folder = Path.of(path);
        File[] musics = folder.toFile().listFiles(file -> file.isFile() && file.getName().toLowerCase().endsWith(".mp3"));
        for (File file : musics) {
            Music music = new Music(file.getName().replace(".mp3", ""), file.getAbsolutePath());
            musicList.add(music);
        }
        return musicList;
    }
}