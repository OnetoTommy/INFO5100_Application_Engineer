package edu.neu.mgen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// // Calculator
// public class gui07 {
  
//   public static void main(String[] args) {
//     MyFrame myFrame = new MyFrame();
//     // System.out.println(myFrame);

//   }
// }

// class MyFrame extends Frame{

//   public MyFrame(){
//     TextField textField = new TextField();
//     add(textField);
//     MyActionListener myActionListener = new MyActionListener();

//     textField.addActionListener(myActionListener);
//     textField.setEchoChar('*');
//     pack();
//     setVisible(true);
//   }
// }

// class MyActionListener implements ActionListener{

//   public void actionPerformed(ActionEvent e){
//     TextField field = (TextField) e.getSource();
//     System.out.println(field.getText());
//     field.setText("");

//   }
// }

// Calculator
public class gui07 {

  public static void main(String[] args) {
    MyFrame myFrame = new MyFrame();
    System.out.println(myFrame);
  }
}

class MyFrame extends Frame {

  public MyFrame(){
    // Create the text field
    TextField textField = new TextField();
    
    // Add it to the frame
    add(textField);
    
    // Create an action listener
    MyActionListener myActionListener = new MyActionListener();
    textField.addActionListener(myActionListener);
    
    // Set echo character for the password
    textField.setEchoChar('*');
    
    // Set frame properties
    setSize(300, 200);  // Set the size of the window
    setVisible(true);    // Make the frame visible
  }
}

class MyActionListener implements ActionListener {

  public void actionPerformed(ActionEvent e){
    TextField field = (TextField) e.getSource();
    System.out.println(field.getText());
    field.setText("");  // Clear the text field after action
  }
}
