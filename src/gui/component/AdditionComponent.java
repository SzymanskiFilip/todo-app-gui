package gui.component;

import javax.swing.*;
import java.awt.*;

public class AdditionComponent extends JPanel {

    public AdditionComponent() {
        initializeComponent();
    }

    void initializeComponent() {
        this.setBackground(Color.red);
        this.setPreferredSize(new Dimension(200, 150));
    }
}
