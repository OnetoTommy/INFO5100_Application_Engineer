package edu.neu.mgen;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class swing1 {

  public void init(){
    JFrame frame = new JFrame("JFrame");
    frame.setVisible(true);
    frame.setBounds(100,100, 200, 200);
    frame.setBackground(Color.BLUE);
    JLabel label = new JLabel("XXXX");
    frame.add(label);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new JFrame();
  }
}
