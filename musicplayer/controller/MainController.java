package musicplayer.controller;

import java.awt.event.ActionEvent;

import musicplayer.view.component.PlayPauseButton.MusicStatus;
import musicplayer.view.panel.InfoPanel;
import musicplayer.view.panel.MenuPanel;
import musicplayer.view.panel.MusicListPanel;
import musicplayer.view.panel.MusicStatusPanel;

public class MainController {
    private MenuPanel menuPanel;
    private MusicListPanel musicListPanel;
    private InfoPanel infoPanel;
    private MusicStatusPanel musicStatusPanel;

    public MainController(MenuPanel menuPanel, MusicListPanel musicListPanel, InfoPanel infoPanel, MusicStatusPanel musicStatusPanel) {
        this.menuPanel = menuPanel;
        this.musicListPanel = musicListPanel;
        this.infoPanel = infoPanel;
        this.musicStatusPanel = musicStatusPanel;

        settingActionListeners();
    }

    public void settingActionListeners() {
        musicStatusPanel.addPlayPauseButtonActionListener((ActionEvent event) -> {
            if (musicStatusPanel.getPlayPauseButton().getMusicStatus() == MusicStatus.PLAYING) {
                musicListPanel.getController().pause();
                musicStatusPanel.getPlayPauseButton().alterText();
            } else {
                musicListPanel.getController().resume();
                musicStatusPanel.getPlayPauseButton().alterText();                
            }
        });
    }
}
