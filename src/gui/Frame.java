package gui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(){
        initializeFrame();
    }


    public void initializeFrame(){
        this.setTitle("Hello!");
        this.getContentPane().setBackground(Color.GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 600);
        this.setResizable(false);
        this.setVisible(true);
    }
}
