package musicplayer.controller;

import java.awt.event.ActionEvent;
import musicplayer.view.panel.InfoPanel;
import musicplayer.view.panel.MenuPanel;
import musicplayer.view.panel.MusicListPanel;
import musicplayer.view.panel.MusicStatusPanel;

public class MainController {
    private final MenuPanel menuPanel;
    private final MusicListPanel musicListPanel;
    private final InfoPanel infoPanel;
    private final MusicStatusPanel musicStatusPanel;

    public MainController(MenuPanel menuPanel, MusicListPanel musicListPanel, InfoPanel infoPanel, MusicStatusPanel musicStatusPanel) {
        this.menuPanel = menuPanel;
        this.musicListPanel = musicListPanel;
        this.infoPanel = infoPanel;
        this.musicStatusPanel = musicStatusPanel;

        addHomeButtonInteractivity();
    }

    public void addHomeButtonInteractivity() {
        menuPanel.addHomeButtonActionListener((ActionEvent e) -> {
            musicListPanel.loadMusicsFromHome();
        });
    }
}