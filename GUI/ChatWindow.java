package edu.neu.mgen.GUI;

/*
A chat application using chat windows
Sign-up and login tools
Two chat participants can send typed messages and receive messages.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class ChatWindow {
  public static void main(String[] args) {
    // new LoginWindow();
    SwingUtilities.invokeLater(() -> new LoginWindow());
  }

}

class LoginWindow extends JFrame {

  public LoginWindow() {
    super("Login Window");
    setBackground(Color.CYAN);
    setBounds(100, 100, 300, 150);

    TextField username = new TextField("");
    JPasswordField password = new JPasswordField();
    Label userLabel = new Label("Username:");
    Label pwLabel = new Label("Password:");
    Button signupButton = new Button("Signup");
    Button loginButton = new Button("Login in");

    signupButton.addActionListener(new LoginActionListener(username, password));

    add(userLabel);
    add(username);
    add(pwLabel);
    add(password);
    add(loginButton);
    add(signupButton);
    setLayout(new GridLayout(3, 2));
    setVisible(true);
  }
}

class LoginActionListener implements ActionListener {

  private TextField username;
  private JPasswordField password;

  public LoginActionListener(TextField username, JPasswordField password) {
    this.username = username;
    this.password = password;
  }

  public void actionPerformed(ActionEvent e) {

    String user = username.getText();
    String pd = new String(password.getPassword());
    if (user.equals("user") && pd.equals("pass")) {
      // String currentUser = user;
      // LoginWindow.setVisible(false);
      new showChatWindow();
    } else {
      JOptionPane.showMessageDialog(new showChatWindow(), "Invalid login credentials!");
    }

  }
}

class showChatWindow extends JFrame {

  JTextField messageField;
  JTextArea chatArea;
  // public showChatWindow(JTextField messageField, JTextArea chatArea){
  // this.messageField = messageField;
  // this.chatArea = chatArea;
  // }

  public showChatWindow() {
    super("Chat Window");
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    // Chat area to display messages
    JTextArea chatArea = new JTextArea();
    chatArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(chatArea);
    add(scrollPane, BorderLayout.CENTER);

    // Message input field and send button
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());

    JTextField messageField = new JTextField();
    JButton sendButton = new JButton("Send");

    panel.add(messageField, BorderLayout.CENTER);
    panel.add(sendButton, BorderLayout.EAST);

    add(panel, BorderLayout.SOUTH);

    // Send button action
    // new SendButton(messageField, chatArea);
    sendButton.addActionListener(new SendButton(messageField, chatArea));

    setVisible(true);
  }

  // private void sendMessage() {
  // String message = messageField.getText();
  // if (!message.trim().isEmpty()) {
  // chatArea.append("User" + ": " + message + "\n");
  // messageField.setText("");
  // }
}

class SendButton implements ActionListener {
  JTextField messageField;
  JTextArea chatArea;

  public SendButton(JTextField messageField, JTextArea chatArea) {
    this.chatArea = chatArea;
    this.messageField = messageField;
  }

  public void actionPerformed(ActionEvent e) {
    String message = messageField.getText();
    if (!message.trim().isEmpty()) {
      chatArea.append("User" + ": " + message + "\n");
      messageField.setText("");
    }
  }
}

// class sendMessage{
// JTextField messageField;
// JTextArea chatArea;

// public sendMessage(JTextField messageField, JTextArea chatArea){
// this.messageField = messageField;
// this.chatArea = chatArea;
// }

// public sendMessage(){
// String message = messageField.getText();
// if (!message.trim().isEmpty()) {
// chatArea.append("user" + ": " + message + "\n");
// messageField.setText("");
// }
// }

// }
