package musicplayer.view.panel;

import java.awt.Dimension;
import java.awt.Desktop.Action;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import musicplayer.view.component.MenuButton;

public class MenuPanel extends JPanel {
    private final MenuButton homeButton;
    private final MenuButton openFolderButton;
    private final MenuButton playlistsButton;

    public MenuPanel() {
        Dimension size = new Dimension(150, 500);
        setSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

        BoxLayout layoutManager = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layoutManager);

        Border border = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(border);

        homeButton = new MenuButton("Home");
        openFolderButton = new MenuButton("Open Folder");
        playlistsButton = new MenuButton("Playlists");

        add(homeButton);
        add(Box.createVerticalStrut(5));
        add(openFolderButton);
        add(Box.createVerticalStrut(5));
        add(playlistsButton);
    }

    public void addHomeButtonActionListener(ActionListener event) {
        homeButton.addActionListener(event);
    }

    public void addOpenFolderButtonActionListener(ActionListener event) {
        openFolderButton.addActionListener(event);
    }

    public void addPlaylistsButtonActionListener(ActionListener event) {
        playlistsButton.addActionListener(event);
    }
}