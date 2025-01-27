package edu.neu.mgen;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Layout
public class gui04 {
  public static void main(String[] args) {
    
    Frame frame = new Frame();

    Button b1 = new Button("b1");
    Button b2 = new Button("b2");
    Button b3 = new Button("b3");
    
    // set flowlayout
    frame.setLayout(new FlowLayout(FlowLayout.LEFT));

    frame.setSize(200,200);

    frame.add(b1);
    frame.add(b3);
    frame.add(b2);

    frame.setVisible(true);

    frame.addWindowListener(new WindowAdapter() {
      
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }

    });


  }
  
}
