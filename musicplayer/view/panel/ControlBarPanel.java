package musicplayer.view.panel;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JSlider;

import musicplayer.view.component.MusicPictureLabel;

public class ControlBarPanel extends JPanel {
    private GridBagLayout layoutManager;
    private GridBagConstraints layoutConstraints;

    public ControlBarPanel(Integer width, Integer height) {
        super();

        Dimension size = new Dimension(width, height);
        this.setMinimumSize(size);
        this.setPreferredSize(size);
        this.setMaximumSize(size);
        this.setSize(size);

        GridBagLayout layoutManager = new GridBagLayout();
        GridBagConstraints layoutConstraints = new GridBagConstraints();
        this.layoutManager = layoutManager;
        this.layoutConstraints = layoutConstraints;
        this.setLayout(layoutManager);

        MusicPictureLabel pictureLabel = new MusicPictureLabel(50, 50);
        this.addComponent(pictureLabel, 1, 1, 2, 2, GridBagConstraints.CENTER);

        JSlider timeSlider = new JSlider(0, 100);
        this.addComponent(timeSlider, 1, 5, 3, 1, GridBagConstraints.CENTER);
    }

    public void addComponent(Component component, Integer row, Integer column, Integer width, Integer height, int anchor) {
        this.layoutConstraints.gridx = column;
        this.layoutConstraints.gridy = row;
        this.layoutConstraints.gridwidth = width;
        this.layoutConstraints.gridheight = height;
        this.layoutConstraints.anchor = anchor;
        this.add(component, this.layoutConstraints);
    }

}
