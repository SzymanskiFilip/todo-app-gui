package gui;

import gui.component.AddingComponent;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    JFrame frame;
    AddingComponent addingComponent;

    public Frame(){
        frame = new JFrame("Todo App");
        // Add components here
        frame.getContentPane().add(new AddingComponent(new GridLayout(1,2)));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
