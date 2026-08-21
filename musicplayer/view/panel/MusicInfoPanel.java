package musicplayer.view.panel;

import java.awt.Dimension;

import javax.swing.JPanel;

public class MusicInfoPanel extends JPanel {
    public MusicInfoPanel(Integer width, Integer height) {
        super();

        Dimension size = new Dimension(width, height);
        this.setSize(size);
    }
}
