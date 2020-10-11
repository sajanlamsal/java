package com.sujata.Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI1 implements ActionListener {

    private int count = 0;
    private static JFrame frame;
    private static JButton button;
    private static JLabel label;
    private static JPanel panel;


    public GUI1(){
         frame = new JFrame();

         button = new JButton("Click Me");
         label = new JLabel("Number of clicks: 0");
         button.addActionListener(this);

         panel = new JPanel();
         panel.setBorder(BorderFactory.createEmptyBorder(30,30,60,30));
         panel.setLayout(new GridLayout(0,1));
         panel.add(button);
         panel.add(label);


        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();

        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new GUI1();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks:" +" "+ count);

    }
}
