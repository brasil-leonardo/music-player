package musicplayer.view.panel;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MusicListPanel extends JScrollPane {
    private JPanel viewPanel;

    public MusicListPanel(Integer width, Integer height) {
        super();

        JPanel panel = new JPanel();
        this.viewPanel = panel;
        this.setViewportView(panel);

        Dimension size = new Dimension(width, height);
        this.setMinimumSize(size);
        this.setPreferredSize(size);
        this.setMaximumSize(size);
        this.setSize(size);

        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }
}
