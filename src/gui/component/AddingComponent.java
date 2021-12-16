package gui.component;

import javax.swing.*;
import java.awt.*;

public class AddingComponent extends JPanel {
    JButton button;
    JTextField textField;


    public AddingComponent(LayoutManager layout){
        super(layout);
        button = new JButton("Add");
        textField = new JTextField();

        add(button);
        add(textField);
    }
}
