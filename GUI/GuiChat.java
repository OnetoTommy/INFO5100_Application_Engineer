package edu.neu.mgen.GUI;


import javax.swing.*;
import java.awt.*;


public class GuiChat {
    // Main chat window components
    private JFrame mainFrame;
    private JTextArea chatArea;
    private JTextField messageField;
    private JButton sendButton;
    private String currentUser;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GuiChat().showLoginScreen());
    }

    // Method to show the login screen
    private void showLoginScreen() {
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setLayout(new GridLayout(3, 2));
        loginFrame.setSize(300, 150);

        // Username and password fields
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton signUpButton = new JButton("Sign Up");

        loginFrame.add(new JLabel("Username:"));
        loginFrame.add(usernameField);
        loginFrame.add(new JLabel("Password:"));
        loginFrame.add(passwordField);
        loginFrame.add(loginButton);
        loginFrame.add(signUpButton);

        loginFrame.setVisible(true);

        // Login button action
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // For simplicity, no actual login logic here, just hardcoded username and password
            if (username.equals("user") && password.equals("password")) {
                currentUser = username;
                loginFrame.setVisible(false);
                showChatWindow();
            } else {
                JOptionPane.showMessageDialog(loginFrame, "Invalid login credentials!");
            }
        });

        // Sign up button action
        signUpButton.addActionListener(e -> {
            // Here, you can add logic to sign up (e.g., save user details to a file or database)
            JOptionPane.showMessageDialog(loginFrame, "Sign-up functionality not implemented yet.");
        });
    }

    // Method to show the chat window after login
    private void showChatWindow() {
        mainFrame = new JFrame("Chat Window");
        mainFrame.setSize(500, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());

        // Chat area to display messages
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        mainFrame.add(scrollPane, BorderLayout.CENTER);

        // Message input field and send button
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        messageField = new JTextField();
        sendButton = new JButton("Send");

        panel.add(messageField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        mainFrame.add(panel, BorderLayout.SOUTH);

        // Send button action
        sendButton.addActionListener(e -> sendMessage());

        mainFrame.setVisible(true);
    }

    // Method to send a message and update the chat area
    private void sendMessage() {
        String message = messageField.getText();
        if (!message.trim().isEmpty()) {
            chatArea.append(currentUser + ": " + message + "\n");
            messageField.setText("");
        }
    }
}

