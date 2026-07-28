package musicplayer.view.component;

import java.awt.Dimension;
import java.awt.Desktop.Action;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MusicCard extends JPanel {
    private JLabel musicName;
    private JButton playButton;
    public MusicCard(String name, String filePath) {
        this.setSize(new Dimension(562, 30));
        this.setPreferredSize(new Dimension(562, 30));
        this.setMinimumSize(new Dimension(562, 30));
        this.setMaximumSize(new Dimension(562, 30));

        Border border = BorderFactory.createEmptyBorder(0, 5, 0, 5);
        this.setBorder(border);

        BoxLayout layoutManager = new BoxLayout(this, BoxLayout.X_AXIS);
        this.setLayout(layoutManager);

        musicName = new JLabel(name);
        playButton = new JButton("Play");

        this.add(musicName);
        this.add(Box.createHorizontalGlue());
        this.add(playButton);
    }

    public void addPlayButtonActionListener(ActionListener event) {
        playButton.addActionListener(event);
    }
}