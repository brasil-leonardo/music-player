package musicplayer.controller;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import musicplayer.model.Music;

public class MusicListController {
    private final Path homePath = Path.of(System.getProperty("user.home"), "\\Music");

    public Path getHomePath() {
        return this.homePath;
    }

    public ArrayList<Music> getMusics(String path) {
        ArrayList<Music> musicList = new ArrayList<Music>();
        File[] musics = homePath.toFile().listFiles(file -> file.isFile() && file.getName().toLowerCase().endsWith(".mp3"));
        for (File file : musics) {
            musicList.add(new Music(file.getName().replace(".mp3", ""), file.getAbsolutePath()));
        }
        musicList.getFirst().play();
        return musicList;
    }
}