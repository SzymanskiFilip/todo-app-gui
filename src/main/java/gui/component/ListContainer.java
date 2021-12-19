package gui.component;

import javax.swing.*;
import java.awt.*;

public class ListContainer extends JPanel {


    public ListContainer(){
       this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
       this.setBackground(Color.magenta);

       this.add(new JButton("hello"));
       this.add(new JButton("hellooooo"));
       this.add(new ListComponent());
    }
}
