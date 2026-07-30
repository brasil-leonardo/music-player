package musicplayer.model;

import java.io.File;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;

public class  Music {
    private File file;
    private String name;
    private String album;
    private String author;
    private int duration;

    public Music(File file) {
        this.file = file;

        try {
            AudioFile audioFile = AudioFileIO.read(file);
            this.name = audioFile.getTag().getFirst(FieldKey.TITLE);
            this.author = audioFile.getTag().getFirst(FieldKey.ARTIST);
            this.album = audioFile.getTag().getFirst(FieldKey.ALBUM);
            this.duration = audioFile.getAudioHeader().getTrackLength();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public File getFile() {
        return file;
    }

    public String getName() {
        return name;
    }

    public String getFormatedName() {
        return name.replace(".mp3", "");
    }

    public String getAlbum() {
        return album;
    }

    public String getAuthor() {
        return author;
    }

    public int getDuration() {
        return duration;
    }

    public String getFormatedDuration() {
        int duration = this.duration;

        int minutes = 0;
        int seconds = 0;

        while (duration > 60) {
            duration -= 60;
            minutes++;
        }

        return String.format("%02d:%02d", minutes, seconds);
    }
}