package edu.neu.mgen;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

// AddActionListener for mouse
public class gui10 {
  public static void main(String[] args) {
    new MyFrame("Paint");
  }
}

class MyFrame extends Frame{
  // Mouse actionlistener and save history 
  public MyFrame(String title){
    super(title);
    setBounds(200, 200, 400, 300);
    this.addMouseListener(null);
  }

  public void paint(Graphics g){

  }

  private class MyMouseListener extends MouseAdapter{
 
  }
}


