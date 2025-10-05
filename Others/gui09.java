package edu.neu.mgen;

import java.awt.*;

public class gui09 {
  public static void main(String[] args) {
    new MyPaint();
  }
  
}

class MyPaint extends Frame{
  
  public void loadFrame(){
    setBounds(200, 200, 600, 500);
    setVisible(true);
  }

  public void paint(Graphics g){
    g.setColor(Color.red);
    g.drawOval(100, 100, 100, 100);
  }

}
