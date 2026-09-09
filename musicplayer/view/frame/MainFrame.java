package musicplayer.view.frame;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import musicplayer.view.panel.ControlBarPanel;
import musicplayer.view.panel.MenuPanel;
import musicplayer.view.panel.MusicInfoPanel;
import musicplayer.view.panel.MusicListPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;

public class MainFrame extends JFrame {
    private JPanel contentPanel;

    public MainFrame(String title, String iconPath, Integer width, Integer height) {
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle(title);

        ImageIcon imageIcon = new ImageIcon(iconPath);
        Image image = imageIcon.getImage();
        this.setIconImage(image);

        Dimension size = new Dimension(width, height);
        this.setMinimumSize(size);
        this.setPreferredSize(size);
        this.setMaximumSize(size);
        this.setSize(size);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel();
        this.contentPanel = contentPanel;
        this.setContentPane(contentPanel);

        Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        this.contentPanel.setBorder(border);

        BorderLayout layoutManager = new BorderLayout(5, 5);
        this.contentPanel.setLayout(layoutManager);

    }

    public void addMenuPanel(MenuPanel menuPanel) {
        this.add(menuPanel, BorderLayout.LINE_START);
    }

    public void addMusicListPanel(MusicListPanel musicListPanel) {
        this.add(musicListPanel, BorderLayout.CENTER);
    }

    public void addMusicInfoPanel(MusicInfoPanel musicInfoPanel) {
        this.add(musicInfoPanel, BorderLayout.LINE_END);
    }

    public void addControlBarPanel(ControlBarPanel controlBarPanel) {
        this.add(controlBarPanel, BorderLayout.PAGE_END);
    }
}
