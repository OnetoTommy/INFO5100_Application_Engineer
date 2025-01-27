package edu.neu.mgen;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 简易计算器
public class gui08 {
  public static void main(String[] args) {

    new Calculator();

  }

}

// Calculator
class Calculator extends Frame {

  public Calculator() {

    // 3 TextFields
    TextField textField1 = new TextField(10);
    TextField textField2 = new TextField(10);
    TextField textField3 = new TextField(20);

    // button
    Button button = new Button("=");
    button.addActionListener(new MyCalculatorListener(textField1, textField2, textField3));

    // label
    Label label = new Label("+");

    setLayout(new FlowLayout());
    add(textField1);
    add(label);
    add(textField2);
    add(button);
    add(textField3);

    pack();
    setVisible(true);
  }

  public void windowClose(){
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }
    });
  }

}

// Actionlister
class MyCalculatorListener implements ActionListener {

  private TextField textField1, textField2, textField3;

  public MyCalculatorListener(TextField textField1, TextField textField2, TextField textField3) {
    this.textField1 = textField1;
    this.textField2 = textField2;
    this.textField3 = textField3;

  }

  public void actionPerformed(ActionEvent e) {
    // Get numbers
    int n1 = Integer.parseInt(textField1.getText());
    int n2 = Integer.parseInt(textField2.getText());
    // Put third box after plus
    textField3.setText("" + (n1 + n2));
    // clean the first and second box
    textField1.setText("");
    textField2.setText("");

  }
}