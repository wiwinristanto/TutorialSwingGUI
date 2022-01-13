package com.tutorial.swing.view1;

import com.sun.istack.internal.Nullable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface Action {
    public void receiveData1(String firstname, String LastName, String age);
}

public class MainForm {
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JTextField tfAge;
    private JButton button2;
    private JPanel rootPanel;
    private JButton openJOptionPane;
    @Nullable
    private Action action;
    private TargedForm targedForm;

    public void setListener(Action listener) {
        action = listener;
    }

    public MainForm() {
        targedForm = new TargedForm();
        targedForm.createLayout();
        openJOptionPane.addActionListener(actionEvent -> {
            JOptionPane.showMessageDialog(rootPanel, "Hello JOptionPane", "Information", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(rootPanel, "Error on message", "Error", JOptionPane.ERROR_MESSAGE);
            int result = JOptionPane.showConfirmDialog(rootPanel, "Are you sure want to continue ?");
            if (result == JOptionPane.YES_OPTION) {
                String message = JOptionPane.showInputDialog("Input Your Message");
                JOptionPane.showMessageDialog(rootPanel, "Inputted Message : " + message, "information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        button2.addActionListener(actionEvent -> {
            targedForm.receiveData(tfFirstName.getText(), tfLastName.getText(), tfAge.getText());
            if (action != null) {
//                action.receiveData1(tfFirstName.getText(), tfLastName.getText(), tfAge.getText());
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
