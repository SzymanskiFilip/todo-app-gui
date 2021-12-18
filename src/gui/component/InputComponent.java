package gui.component;

import javax.swing.*;
import java.awt.*;

public class InputComponent extends JPanel {

    JButton button;
    JTextField textField;

    public InputComponent(){
        initialize();
        addComponents();
    }

    void initialize(){
        this.button = new JButton();
        button.setText("Add Todo");
        button.setFocusable(false);

        this.textField = new JTextField();
        this.textField.setColumns(20);
    }

    void addComponents(){
        this.add(button);
        this.add(textField);
    }
}
