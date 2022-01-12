package com.tutorial.swing.view1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JTextField tfAge;
    private JButton button2;
    private JPanel rootPanel;
    private JButton openJOptionPane;

    public MainForm() {
        openJOptionPane.addActionListener(actionEvent -> {
            JOptionPane.showMessageDialog(rootPanel, "Hello JOptionPane", "Information" ,JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(rootPanel, "Error on message", "Error", JOptionPane.ERROR_MESSAGE);
            int result = JOptionPane.showConfirmDialog(rootPanel, "Are you sure want to continue ?");
            if (result == JOptionPane.YES_OPTION){
                String message =JOptionPane.showInputDialog("Input Your Message");
                JOptionPane.showMessageDialog(rootPanel, "Inputted Message : " + message, "information", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TargedForm targedForm = new TargedForm();
                targedForm.createLayout();
                targedForm.receiveData(tfFirstName.getText(), tfLastName.getText(),tfAge.getText());

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
