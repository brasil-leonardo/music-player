package musicplayer.view.component;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MenuButton extends JButton {
    public MenuButton(String text, Integer width, Integer height) {
        super();

        Dimension size = new Dimension(width, height);
        this.setMaximumSize(size);
        this.setSize(size);

        this.setText(text);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
