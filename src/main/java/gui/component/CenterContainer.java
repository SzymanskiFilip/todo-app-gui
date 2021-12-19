package gui.component;

import javax.swing.*;
import java.awt.*;

public class CenterContainer extends JPanel {
    public CenterContainer(){
        this.setLayout(new GridBagLayout());
        this.add(new ListContainer());
    }
}
