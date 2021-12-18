package gui;

import gui.component.AdditionComponent;

import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {

    public Frame(){
        initializeFrame();
    }


    public void initializeFrame(){
        this.setTitle("Hello!");
        this.getContentPane().setBackground(Color.darkGray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 600);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        addComponents();
        this.setVisible(true);
    }

    public void addComponents(){
        //add components
        this.getContentPane().add(new AdditionComponent(), BorderLayout.NORTH);
    }
}
