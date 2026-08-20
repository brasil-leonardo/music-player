package musicplayer.view.frame;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import musicplayer.view.panel.MenuPanel;
import musicplayer.view.panel.MusicListPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;

public class MainFrame extends JFrame {
    public MainFrame(String title, String iconPath, Integer width, Integer height) {
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle(title);

        ImageIcon imageIcon = new ImageIcon(iconPath);
        Image image = imageIcon.getImage();
        this.setIconImage(image);

        Dimension size = new Dimension(width, height);
        this.setSize(size);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel();
        Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        contentPanel.setBorder(border);
        this.setContentPane(contentPanel);

        BorderLayout layoutManager = new BorderLayout(10, 10);
        this.setLayout(layoutManager);

    }

    public void addMenuPanel(MenuPanel menuPanel) {
        this.add(menuPanel, BorderLayout.LINE_START);
    }

    public void addMusicListPanel(MusicListPanel musicListPanel) {
        this.add(musicListPanel, BorderLayout.CENTER);
    }
}
