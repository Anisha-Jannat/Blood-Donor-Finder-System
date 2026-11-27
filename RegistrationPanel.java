package bdf;

import javax.swing.*;

public class RegistrationPanel {

    public static void main(String[] args) {

        JFrame f = new JFrame("Registration");

        JTextField name = new JTextField();
        JTextField phone = new JTextField();

        String group[] = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        JComboBox cb = new JComboBox(group);

        f.setLayout(null);

        f.add(new JLabel("Name:")).setBounds(30, 20, 80, 25);
        name.setBounds(120, 20, 130, 25);
        f.add(name);

        f.add(new JLabel("Phone:")).setBounds(30, 60, 80, 25);
        phone.setBounds(120, 60, 130, 25);
        f.add(phone);

        f.add(new JLabel("Blood Group:")).setBounds(30, 100, 90, 25);
        cb.setBounds(120, 100, 130, 25);
        f.add(cb);

        JButton b = new JButton("Register");
        b.setBounds(90, 150, 110, 30);
        f.add(b);

        f.setSize(320, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}