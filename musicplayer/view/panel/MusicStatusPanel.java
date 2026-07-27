package musicplayer.view.panel;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MusicStatusPanel extends JPanel {
    public MusicStatusPanel() {
        Dimension size = new Dimension(900, 100);
        setSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

        setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
    }
}