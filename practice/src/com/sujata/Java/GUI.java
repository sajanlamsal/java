package com.sujata.Java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI  implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel correct;


    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350 ,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        userLabel= new JLabel("User:");
        userLabel.setBounds(20,40,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100 ,40 ,170, 25);
        panel.add(userText);

        passwordLabel= new JLabel("Password:");
        passwordLabel.setBounds(20,80,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100 ,80 ,170, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(80,120,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        correct = new JLabel("");
        correct.setBounds(20,150,130,25);
        panel.add(correct);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("sujata") && password.equals("aaaa")){
            correct.setText("Login Successful !!");
        }
        else{
            correct.setText("Login Failed !!");
        }
    }
}
