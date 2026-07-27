package musicplayer.view.panel;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import musicplayer.controller.MusicListController;
import musicplayer.model.Music;
import musicplayer.view.component.MusicCard;

public class MusicListPanel extends JScrollPane {
    private MusicListController controller;
    private JPanel panel;

    public MusicListPanel() {
        controller = new MusicListController();

        Dimension size = new Dimension(600, 500);
        setSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

        //setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, Color.BLACK));

        panel = new JPanel();

        BoxLayout layoutManager = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layoutManager);
        setViewportView(panel);

        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        loadMusics();
    }

    public void loadMusics() {
        ArrayList<Music> musics = controller.getMusics(controller.getHomePath().toString());
        panel.add(Box.createVerticalStrut(1));
        for (Music music : musics) {
            panel.add(new MusicCard(music.getName(), music.getFilePath()));
            panel.add(Box.createVerticalStrut(1));
        }
    }
}