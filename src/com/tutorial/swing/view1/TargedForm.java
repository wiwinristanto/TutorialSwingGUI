package com.tutorial.swing.view1;

import javax.swing.*;

public class TargedForm {
    private JPanel rootTarged;
    private JLabel lblFirstNAme;
    private JLabel lblLastName;
    private JLabel lblAge;

    public void createLayout(){
        JFrame JFrame = new JFrame("Target Form");
        JFrame.setContentPane(rootTarged);
        JFrame.pack();
        JFrame.setLocationRelativeTo(null);
       
       // JFrame.setVisible(True);
    }
    public void receiveData(String firstname, String LastName, String age ){
        lblFirstNAme.setText(firstname);
        lblLastName.setText(LastName);
        lblAge.setText(age);
    }
}
