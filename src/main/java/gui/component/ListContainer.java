package gui.component;

import javax.swing.*;
import java.awt.*;

public class ListContainer extends JPanel {
    public ListContainer(){
       this.setLayout(new GridBagLayout());
       this.setBackground(Color.magenta);
       this.add(new ListComponent());
    }
}
