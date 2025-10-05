package edu.neu.mgen;

import java.awt.*;

// GUI interface 
public class gui01 {
  public static void main(String[] args) {
    
    Frame frame = new Frame("Frame");

    // set visible
    frame.setVisible(true);

    // set window size
    frame.setSize(400, 400);

    frame.setBackground(new Color(255,255,15));

    frame.setLocation(200, 200);
    // set fixed size
    frame.setResizable(false);

  }
}
