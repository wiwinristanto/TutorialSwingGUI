package com.tutorial.swing.view1;

import javax.swing.*;

public class TargedForm implements Action {
    private JPanel rootTarged;
    private JLabel lblFirstNAme;
    private JLabel lblLastName;
    private JLabel lblAge;
//    private MainForm mainForm = new MainForm();
    private JFrame frame;

    public void createLayout(){
//        mainForm.setListener(this);
        frame = new JFrame("Target Form");
        frame.setContentPane(rootTarged);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void receiveData1(String firstname, String LastName, String age) {
        frame.setVisible(true);
        lblFirstNAme.setText(firstname);
        lblLastName.setText(LastName);
        lblAge.setText(age);
    }

    public void receiveData(String firstname, String LastName, String age ){
        frame.setVisible(true);
        lblFirstNAme.setText(firstname);
        lblLastName.setText(LastName);
        lblAge.setText(age);
    }
}
