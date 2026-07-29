package musicplayer.view.frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import musicplayer.controller.MainController;
import musicplayer.view.panel.InfoPanel;
import musicplayer.view.panel.MenuPanel;
import musicplayer.view.panel.MusicListPanel;
import musicplayer.view.panel.MusicStatusPanel;

public class MainFrame extends JFrame {
    private final MenuPanel menuPanel;
    private final MusicListPanel musicListPanel;
    private final InfoPanel infoPanel;
    private final MusicStatusPanel musicStatusPanel;
    private final MainController mainController;

    public MainFrame() {
        setTitle("MusicPlayer");

        ImageIcon imageIcon = new ImageIcon("assets/icon.png");
        Image image = imageIcon.getImage();
        setIconImage(image);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension size = new Dimension(900, 600);
        setSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

        setResizable(false);

        setLocationRelativeTo(null);

        BorderLayout layoutManager = new BorderLayout();
        setLayout(layoutManager);

        menuPanel = new MenuPanel();
        add(menuPanel, BorderLayout.LINE_START);

        musicListPanel = new MusicListPanel();
        add(musicListPanel, BorderLayout.CENTER);

        infoPanel = new InfoPanel();
        add(infoPanel, BorderLayout.LINE_END);

        musicStatusPanel = new MusicStatusPanel();
        add(musicStatusPanel, BorderLayout.PAGE_END);

        mainController = new MainController(menuPanel, musicListPanel, infoPanel, musicStatusPanel);

        setVisible(true);
    }

    public MenuPanel getMenuPanel() {
        return menuPanel;
    }

    public MusicListPanel getMusicListPanel() {
        return musicListPanel;
    }

    public InfoPanel getInfoPanel() {
        return infoPanel;
    }

    public MusicStatusPanel getMusicStatusPanel() {
        return musicStatusPanel;
    }

    public MainController getMainController() {
        return mainController;
    }
}