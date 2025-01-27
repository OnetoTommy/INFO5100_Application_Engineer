package edu.neu.mgen;

import java.awt.*;
public class gui02 {
  public static void main(String[] args) {
    // show a few windows
    MyFrame frame1 = new MyFrame(100, 100, 200, 200);
    MyFrame frame2 = new MyFrame(300, 100, 200, 200);
    MyFrame frame3 = new MyFrame(100, 300, 200, 200);
    MyFrame frame4 = new MyFrame(300, 300, 200, 200);
    frame1.setBackground(new Color(255,25,15));
  }
}

class MyFrame extends Frame{
  static int id = 0;
  public MyFrame(int x, int y, int w, int h){
    
    super("Myframe+" + (++id));
    setVisible(true);
    setBounds(x,y,w,h);
    // setBackground(color);




  }
}