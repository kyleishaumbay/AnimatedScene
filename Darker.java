/**
This class is a basic rectangle that covers the whole frame.
This is particularly used in my animation to add a color to the 
whole frame.
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
was obtained from another source, such as a teotbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/

import java.awt.*;

public class Darker implements DrawingObject {

    private int o;

/** 
* assigns an initial value of 0 to the opacity
* @param o is the opacity of the shape
*/
    public Darker() {
        o = 0;
    }

    @Override

/** 
*  instantiates the rectangle shape that will be used for the listener
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Rectangle dark = new Rectangle(0, 0, 1024, 768, new Color(0,0,0, o));
        dark.draw(g2d);
    }

/** 
*  assigns the value of parameter s to o
* @param s is the passed on value of the opacity of the shape
*/
    public void show(int s) {
        o = s;
    }
}
