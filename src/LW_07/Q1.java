package LW_07;

import javax.swing.*;
import java.awt.event.*;

public class Q1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(50, 30, 100, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(150, 30, 150, 25);
        frame.add(txtName);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(50, 70, 100, 25);
        frame.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(150, 70, 150, 25);
        frame.add(txtEmail);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(50, 110, 100, 25);
        frame.add(lblPassword);

        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 110, 150, 25);
        frame.add(txtPassword);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(150, 160, 100, 30);
        frame.add(btnRegister);

        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Registration Successful");
            }
        });

        frame.setVisible(true);
    }
}
