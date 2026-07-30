package musicplayer.view.component;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import musicplayer.model.Music;

public class MusicCard extends JPanel {
    private Music music;
    private JLabel musicLabel;
    private JButton playButton;

    public MusicCard(Music music) {
        this.music = music;

        this.setSize(new Dimension(562, 30));
        this.setPreferredSize(new Dimension(562, 30));
        this.setMinimumSize(new Dimension(562, 30));
        this.setMaximumSize(new Dimension(562, 30));

        Border border = BorderFactory.createEmptyBorder(0, 5, 0, 5);
        this.setBorder(border);

        BoxLayout layoutManager = new BoxLayout(this, BoxLayout.X_AXIS);
        this.setLayout(layoutManager);

        StringBuilder label = new StringBuilder();
        label.append(music.getFormatedName());
        label.append(" - ");
        label.append(music.getFormatedDuration());

        musicLabel = new JLabel(label.toString());
        playButton = new JButton("Play");

        this.add(musicLabel);
        this.add(Box.createHorizontalGlue());
        this.add(playButton);
    }

    public Music getMusic() {
        return music;
    }

    public JLabel getmusicLabel() {
        return musicLabel;
    }

    public JButton getPlayButton() {
        return playButton;
    }
}