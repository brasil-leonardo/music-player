package musicplayer.model;



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
}