package LW_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1 extends JFrame {

    JLabel lblTitle, lblName, lblEmail, lblPassword, lblConfirm;
    JTextField txtName, txtEmail;
    JPasswordField txtPassword, txtConfirm;
    JButton btnSignup, btnClear;

    public Q1() {
        setTitle("Sign Up");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lblTitle = new JLabel("Sign Up");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitle.setBounds(150, 20, 100, 30);
        add(lblTitle);

        lblName = new JLabel("Name:");
        lblName.setBounds(50, 70, 100, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(150, 70, 180, 25);
        add(txtName);

        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(50, 110, 100, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(150, 110, 180, 25);
        add(txtEmail);

        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 150, 100, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 150, 180, 25);
        add(txtPassword);

        lblConfirm = new JLabel("Confirm:");
        lblConfirm.setBounds(50, 190, 100, 25);
        add(lblConfirm);

        txtConfirm = new JPasswordField();
        txtConfirm.setBounds(150, 190, 180, 25);
        add(txtConfirm);

        btnSignup = new JButton("Sign Up");
        btnSignup.setBounds(80, 240, 100, 30);
        add(btnSignup);

        btnClear = new JButton("Clear");
        btnClear.setBounds(200, 240, 100, 30);
        add(btnClear);

        btnSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String email = txtEmail.getText();
                String password = new String(txtPassword.getPassword());
                String confirm = new String(txtConfirm.getPassword());

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are required");
                } else if (!password.equals(confirm)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match");
                } else {
                    JOptionPane.showMessageDialog(null, "Sign Up Successful!");
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                txtEmail.setText("");
                txtPassword.setText("");
                txtConfirm.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q1();
    }
}
