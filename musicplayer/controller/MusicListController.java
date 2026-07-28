package musicplayer.controller;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

import musicplayer.model.MP3Player;
import musicplayer.model.Music;

public class MusicListController {
    private Path homePath = Path.of(System.getProperty("user.home"), "Music");
    private MP3Player player = new MP3Player();

    public ArrayList<Music> getMusicsFromHome() {
        return listMusics(homePath);
    }

    public ArrayList<Music> getMusicsFromFolder(String path) {
        return listMusics(Path.of(path));
    }

    public ArrayList<Music> listMusics(Path path) {
        ArrayList<Music> musicList = new ArrayList<>();
        File[] musics = path.toFile().listFiles(file -> file.isFile() && file.getName().toLowerCase().endsWith(".mp3"));
        for (File file : musics) {
            Music music = new Music(file.getName().replace(".mp3", ""), file.getAbsolutePath());
            musicList.add(music);
        }        
        return musicList;
    }

    public void play(Music music) {
        player.play(music);
    }

    public void pause() {
        player.pause();
    }

    public void resume() {
        player.resume();
    }
}