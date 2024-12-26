/**
The SceneFrame class is the frame for the graphics.
This is where all the classes will be added.
It also contains the listeners that I will use for the animation.
@author Marie Kyleisha E. Umbay (226508)
@version March 2, 2023
**/
/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.
I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;


public class SceneFrame {
    private JFrame frame;
    private SceneCanvas sc;

/** 
* creates the instance of the JFrame and SceneCanvas object
*/
    public SceneFrame() {
        frame = new JFrame();
        sc = new SceneCanvas();
    }

/** 
* set ups the elements for the GUI 
*/
    public void setUpGUI() {
        Container cp = frame.getContentPane();
        frame.setTitle("Midterm Project - Umbay, Marie Kyleisha - 226508");
        cp.add(sc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

/** 
* an anonymous key listener class that waits for an event in the keyboard to generate an action
*/
    frame.addKeyListener(new KeyListener() { 
        @Override
        public void keyTyped(KeyEvent e) {}
        @Override
/** 
* method that happens when a key is pressed
* @param KeyEvent e
*/
        public void keyPressed(KeyEvent e) {
          int key = e.getKeyCode();
          if (key == KeyEvent.VK_LEFT) { 
            sc.getTinkerbell().moveH(-10);
            sc.repaint();
          }
          else if (key == KeyEvent.VK_RIGHT) {
            sc.getTinkerbell().moveH(10);
            sc.repaint();
          }
          else if(key == KeyEvent.VK_UP) {
            sc.getTinkerbell().moveV(-10);
            sc.repaint();
          }
          else if(key == KeyEvent.VK_DOWN) {
            sc.getTinkerbell().moveV(10);
            sc.repaint();
          }
        }
        @Override
        public void keyReleased(KeyEvent e) {}
      });

/** 
* an anonymous mouse listener class that waits for an event in the mouse to generate an action
*/
      frame.addMouseListener(new MouseListener() { 
        Timer t = new Timer(10, new ActionListener(){
          @Override
/** 
* an anonymous action listener method that waits for an event in the mouse to generate an action
* @param ActionEvent ae
*/
          public void actionPerformed(ActionEvent ae) {
            sc.getStars().flicker();
            sc.repaint();
          }
        });
        @Override
        public void mouseClicked(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}  
        @Override
        public void mouseExited(MouseEvent e) {}  
        @Override
/** 
* method that happens when the mouse is clicked
* @param MouseEvent e
*/
        public void mousePressed(MouseEvent e) {
          int xCoor = e.getX();
          int yCoor = e.getY();
          if ((xCoor > 899) && (xCoor < 913) && (yCoor > 74 && yCoor < 82)) {
            t.start();
            sc.getSwitch().onLight();
            sc.getDark().show(100);
            sc.getTinkerbell().show(255);
            sc.getStars().show(255);
            sc.repaint();
          }
          else if((xCoor > 899) && (xCoor < 913) && (yCoor > 65 && yCoor < 74)) {
            t.stop();
            sc.getSwitch().offLight();
            sc.getDark().show(0);
            sc.getTinkerbell().show(0);
            sc.getStars().show(0);
            sc.repaint();
          }
        }  
        @Override
        public void mouseReleased(MouseEvent e) {}  
    });
}
}
