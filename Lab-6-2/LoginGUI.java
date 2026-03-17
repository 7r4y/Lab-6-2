import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Screen");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");

        // Button actions
        loginButton.addActionListener(e -> {
            String username = userField.getText();
            System.out.println("Login clicked");
            System.out.println("Username: " + username);
        });

        registerButton.addActionListener(e -> {
            System.out.println("Register button clicked");
        });

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(registerButton);

        frame.setVisible(true);
    }
}