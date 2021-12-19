package gui.component;

import javax.swing.*;
import java.awt.*;

public class ListComponent extends JList {

    private static String[] options = {"12222222222222222","2","3","4","5","6","7"};

    public ListComponent(){
        super(options);
        setLayout(new FlowLayout());
        setVisibleRowCount(20);
        setPreferredSize(new Dimension(400, 200));
    }
}
