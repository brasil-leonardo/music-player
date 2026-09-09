package musicplayer;

import java.awt.EventQueue;

import musicplayer.view.frame.MainFrame;
import musicplayer.view.panel.ControlBarPanel;
import musicplayer.view.panel.MenuPanel;
import musicplayer.view.panel.MusicInfoPanel;
import musicplayer.view.panel.MusicListPanel;

public class MusicPlayer {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame("MusicPlayer", "assets/icons/icon.png", 920, 815);
            MenuPanel menuPanel = new MenuPanel(150, 650);
            MusicListPanel musicListPanel = new MusicListPanel(600, 650);
            MusicInfoPanel musicInfoPanel = new MusicInfoPanel(150, 650);
            ControlBarPanel controlBarPanel = new ControlBarPanel(920, 165);

            mainFrame.addMenuPanel(menuPanel);
            mainFrame.addMusicListPanel(musicListPanel);
            mainFrame.addMusicInfoPanel(musicInfoPanel);
            mainFrame.addControlBarPanel(controlBarPanel);

            mainFrame.setVisible(true);
        });

    }
}