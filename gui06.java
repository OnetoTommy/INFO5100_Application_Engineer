package edu.neu.mgen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class gui06 {

  public static void main(String[] args) {
    // start and stop button

    Frame frame = new Frame();
    Button button1 = new Button("start");
    Button button2 = new Button("stop");
    button1.setActionCommand("button1-start");
    button2.setActionCommand("button2-stop");
    MyMonitor mymMonitor = new MyMonitor();

    button1.addActionListener(mymMonitor);
    button2.addActionListener(mymMonitor);
    
    frame.add(button2, BorderLayout.NORTH);
    frame.add(button1, BorderLayout.SOUTH);

    frame.pack();
    windowClose(frame);
    frame.setVisible(true);



  }

  private static void windowClose(Frame frame){
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing (WindowEvent e){
        System.exit(0);
      }
    });
  }
  
}

class MyMonitor implements ActionListener {

  public void actionPerformed(ActionEvent e){
    System.out.println("message" + e.getActionCommand());
    e.getActionCommand();
  }

  
}
