package edu.neu.mgen;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent
;
public class gui05 {
  public static void main(String[] args) {
    
    Frame frame = new Frame();
    Button button = new Button("button");
    MyActionListener myActionListener = new MyActionListener();
    button.addActionListener(myActionListener);
    frame.setBounds(200, 200, 500, 500);
    frame.add(button, BorderLayout.CENTER);
    windowClose(frame);
    frame.setVisible(true);
    
  } 


  private static void windowClose(Frame frame){
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }
    });
  }
}

class MyActionListener implements ActionListener{
  
  public void actionPerformed(ActionEvent e){
    System.out.println("aaa");
  }
}

