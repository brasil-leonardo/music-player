package musicplayer;

import java.awt.EventQueue;

import musicplayer.view.frame.MainFrame;
import musicplayer.view.panel.MenuPanel;
import musicplayer.view.panel.MusicInfoPanel;
import musicplayer.view.panel.MusicListPanel;

public class MusicPlayer {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame("MusicPlayer", "assets/icons/icon.png", 910, 810);
            MenuPanel menuPanel = new MenuPanel(150, 600);
            MusicListPanel musicListPanel = new MusicListPanel(600, 600);
            MusicInfoPanel musicInfoPanel = new MusicInfoPanel(150, 600);

            mainFrame.addMenuPanel(menuPanel);
            mainFrame.addMusicListPanel(musicListPanel);
            mainFrame.addMusicInfoPanel(musicInfoPanel);

            mainFrame.setVisible(true);
        });

    }
}