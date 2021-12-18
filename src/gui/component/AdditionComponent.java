package gui.component;

import javax.swing.*;
import java.awt.*;

public class AdditionComponent extends JPanel {

    public AdditionComponent() {
        initializeComponent();
        addComponents();
    }

    void initializeComponent() {
        this.setBackground(Color.red);
        this.setPreferredSize(new Dimension(this.getWidth(), 100));
        this.setLayout(new GridBagLayout());
    }

    void addComponents(){
        this.add(new InputComponent());
    }
}
