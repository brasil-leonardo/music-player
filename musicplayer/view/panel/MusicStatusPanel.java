package musicplayer.view.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import musicplayer.view.component.PlayPauseButton;

public class MusicStatusPanel extends JPanel {
    private PlayPauseButton playPauseButton;

    public MusicStatusPanel() {
        Dimension size = new Dimension(900, 100);
        setSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

        setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));

        playPauseButton = new PlayPauseButton();
        add(playPauseButton);
    }

    public PlayPauseButton getPlayPauseButton() {
        return playPauseButton;
    }

    public void addPlayPauseButtonActionListener(ActionListener event) {
        playPauseButton.addActionListener(event);
    }
}