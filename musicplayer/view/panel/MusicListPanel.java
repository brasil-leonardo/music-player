package musicplayer.view.panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
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

        loadMusicsFromHome();
    }

    public void loadMusicsFromHome() {
        panel.removeAll();
        ArrayList<Music> musics = controller.getMusicsFromHome();
        panel.add(Box.createVerticalStrut(1));
        for (Music music : musics) {
            MusicCard musicCard = new MusicCard(music.getName(), music.getFilePath());
            musicCard.addPlayButtonActionListener((ActionEvent e) -> {
                controller.playMusic(music.getFilePath());
            });
            panel.add(musicCard);
            panel.add(Box.createVerticalStrut(1));
        }
        panel.revalidate();
        panel.repaint();
    }

    public void loadMusicsFromFolder(String path) {
        panel.removeAll();
        ArrayList<Music> musics = controller.getMusicsFromFolder(path);
        panel.add(Box.createVerticalStrut(1));
        for (Music music : musics) {
            MusicCard musicCard = new MusicCard(music.getName(), music.getFilePath());
            musicCard.addPlayButtonActionListener((ActionEvent e) -> {
                controller.playMusic(music.getFilePath());
            });
            panel.add(musicCard);
            panel.add(Box.createVerticalStrut(1));
        }
        panel.revalidate();
        panel.repaint();
    }
}