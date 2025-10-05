package edu.neu.mgen;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// panel空间，但是不能单独存在
public class gui03 {
  public static void main(String[] args) {
    
    Frame frame = new Frame();
    // concept of layout
    Panel panel = new Panel();

    frame.setLayout(null);
    frame.setBounds(300,300,500,500);
    frame.setBackground(new Color(55,15,15));


    // panel 
    panel.setBounds(50,50,100,100);
    panel.setBackground(new Color(255,255,15));

    frame.add(panel);

    frame.setVisible(true);

    // addlistener system.exit(0);
    frame.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }

    });

  }
}


