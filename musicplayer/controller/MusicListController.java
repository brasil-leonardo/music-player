package musicplayer.controller;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

import musicplayer.model.Music;

public class MusicListController {

    public MusicListController() {

    }

    public ArrayList<Music> getMusicsFromHome() {
        Path homePath = Path.of(System.getProperty("user.home"), "Music");
        return getMusicsFrom(homePath);
    }

    public ArrayList<Music> getMusicsFrom(Path path) {
        File folder = path.toFile();
        File[] files = folder.listFiles(file -> file.exists() && file.getName().toLowerCase().endsWith(".mp3"));
        ArrayList<Music> musics = new ArrayList<>();
        for (File file : files) {
            musics.add(new Music(file));
        }
        return musics;
    }
}