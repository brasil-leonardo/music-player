package musicplayer.model;

import java.io.File;
import java.time.Duration;

public class Music {
    private String name;
    private String author;
    private Duration duration;
    private String filePath;
    private File file;

    public Music(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
        this.file = new File(filePath);
    }

    public String getName() {
        return this.name;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public File getFile() {
        return this.file;
    }

}