package musicplayer.view.panel;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

import musicplayer.view.component.MusicInfoLabel;

public class MusicInfoPanel extends JPanel {
    private GridBagLayout layoutManager;
    private GridBagConstraints layoutConstraints;

    public MusicInfoPanel(Integer width, Integer height) {
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
        this.layoutConstraints.insets = new Insets(0, 0, 0, 0);
        this.setLayout(layoutManager);

        MusicInfoLabel titleLabel = new MusicInfoLabel("Title:");
        MusicInfoLabel musicTitleLabel = new MusicInfoLabel("Amor de Fim de Noite");
        this.addComponent(titleLabel, 0, 0);
        this.addComponent(musicTitleLabel, 0, 1);
    }

    public void addComponent(Component component, Integer row, Integer column) {
        this.layoutConstraints.gridx = column;
        this.layoutConstraints.gridy = row;
        this.add(component, this.layoutConstraints);
    }
}
