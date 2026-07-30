package musicplayer.view.panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.nio.file.Path;
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
    private ArrayList<MusicCard> musicCards = new ArrayList<>();

    public MusicListPanel() {
        controller = new MusicListController();

        Dimension size = new Dimension(600, 500);
        setSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

        panel = new JPanel();

        BoxLayout layoutManager = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layoutManager);
        setViewportView(panel);

        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        loadMusicsFromHome();
    }

    public MusicListController getController() {
        return controller;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void loadMusicsFromHome() {
        ArrayList<Music> musics = controller.getMusicsFromHome();
        addMusicCards(musics);
    }

    public void loadMusicsFrom(Path path) {
        ArrayList<Music> musics = controller.getMusicsFrom(path);
        addMusicCards(musics);
    }

    public void addMusicCards(ArrayList<Music> musics) {
        panel.removeAll();
        musicCards.clear();
        for (Music music : musics) {
            MusicCard musicCard = new MusicCard(music);
            musicCards.add(musicCard);
            panel.add(musicCard);
        }
        panel.revalidate();
        panel.repaint();
    }
}