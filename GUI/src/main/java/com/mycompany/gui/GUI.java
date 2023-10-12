/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 2167784
 */
public class GUI {
    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
       panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 50, 100));
       panel.setLayout(new GridLayout(0,1));
        
       frame.add(panel, BorderLayout.CENTER);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("My GUI");
       frame.pack();
       frame.setVisible(true);
       
        
        
        
}

    public static void main(String[] args) {
        new GUI();
    }
}
