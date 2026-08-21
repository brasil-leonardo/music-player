package musicplayer.view.component;

import java.awt.Font;

import javax.swing.JLabel;

public class MusicInfoLabel extends JLabel {
    public MusicInfoLabel(String text) {
        super();

        Font font = new Font("Arial", Font.PLAIN, 10);
        this.setFont(font);

        this.setText(text);
    }
}
