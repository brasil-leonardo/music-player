package musicplayer.view.component;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class MusicPictureLabel extends JLabel {    
    public MusicPictureLabel(Integer width, Integer height) {
        super();

        Dimension size = new Dimension(width, height);
        this.setMinimumSize(size);
        this.setPreferredSize(size);
        this.setMaximumSize(size);
        this.setSize(size);

        this.setBackground(Color.GRAY);
        this.setOpaque(true);
    }
}