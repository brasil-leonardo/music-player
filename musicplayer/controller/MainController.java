package musicplayer.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        setHomeButtonActionListener();
        settingActionListeners();
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

    public void setHomeButtonActionListener() {
        menuPanel.getHomeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicListPanel.loadMusicsFromHome();
            }
        });
    }

    public void settingActionListeners() {
        musicStatusPanel.addPlayPauseButtonActionListener((ActionEvent event) -> {
            if (musicStatusPanel.getPlayPauseButton().getMusicStatus() == MusicStatus.PLAYING) {
                //musicListPanel.getController().pause();
                musicStatusPanel.getPlayPauseButton().alterText();
            } else {
                //musicListPanel.getController().resume();
                musicStatusPanel.getPlayPauseButton().alterText();                
            }
        });
    }
}
