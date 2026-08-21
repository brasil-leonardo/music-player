package musicplayer.view.panel;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import musicplayer.view.component.MenuButton;

public class MenuPanel extends JPanel {
    public MenuPanel(Integer width, Integer height) {
        super();

        Dimension size = new Dimension(width, height);
        this.setSize(size);

        BoxLayout layoutManager = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(layoutManager);

        MenuButton homeButton = new MenuButton("Home", 150, 30);
        MenuButton openFolderButton = new MenuButton("Open Folder", 150, 30);
        MenuButton playlistsButton = new MenuButton("Playlists", 150, 30);
        this.addMenuButton(homeButton);
        this.addMenuButton(openFolderButton);
        this.addMenuButton(playlistsButton);
    }

    public void addMenuButton(MenuButton menuButton) {
        this.add(menuButton);
        Component box = Box.createVerticalStrut(5);
        this.add(box);
    }
}
