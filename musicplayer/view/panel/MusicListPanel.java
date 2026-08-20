package musicplayer.view.panel;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class MusicListPanel extends JScrollPane {
    private JPanel viewContainer;

    public MusicListPanel(Integer width, Integer height) {
        super();

        JPanel panel = new JPanel();
        this.viewContainer = panel;
        this.setViewportView(panel);

        Dimension size = new Dimension(width, height);
        this.setSize(size);

        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }
}
