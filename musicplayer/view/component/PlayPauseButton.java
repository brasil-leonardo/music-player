package musicplayer.view.component;

import javax.swing.JButton;

public class PlayPauseButton extends JButton {
        private MusicStatus status;

    public enum MusicStatus {
        EMPTY,
        PLAYING,
        PAUSED
    }

    public PlayPauseButton() {
        status = MusicStatus.PLAYING;
        setText("Pause");
    }

    public MusicStatus getMusicStatus() {
        return this.status;
    }

    public void alterText() {
        if (this.status == MusicStatus.PLAYING) {
            this.status = MusicStatus.PAUSED;
            setText("Pause");
        } else {
            this.status = MusicStatus.PLAYING;
            setText("Play");
        }
        revalidate();
        repaint();
    }
}
