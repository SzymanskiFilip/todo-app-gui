package gui;

import javax.swing.*;

public class Frame extends JFrame {
    JFrame frame;


    public Frame(){
        frame = new JFrame("Todo App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
