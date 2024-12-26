/**
This Switch class is a shape that resembles a light switch.
This will also be used as a button for my listener.
It consists of my basic shape classes.
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

import java.awt.*;

public class Switch implements DrawingObject {

    private Color on;
    private Color off;

/** 
* assigns the color values
*/
    public Switch() {
        on = Color.WHITE;
        off = Color.LIGHT_GRAY;
    }


    @Override
/** 
*  creates the shape through other basic shapes
*/
    public void draw(Graphics2D g2d) {
        Rectangle switch1 = new Rectangle(888.59, 26.271, 33.9163, 44.8179, Color.LIGHT_GRAY);
        switch1.draw(g2d);

        Rectangle switch2 = new Rectangle(900.2305, 40.0075, 11.598, 16.7527, Color.WHITE);
        switch2.draw(g2d);

        Circle circle1 = new Circle(903.8879, 31.236, 4.494, Color.GRAY);
        Circle circle2 = new Circle(903.8879, 63.2847, 4.494, Color.GRAY);
        circle1.draw(g2d);
        circle2.draw(g2d);

        Rectangle switch3 = new Rectangle(900.6348, 40.5321, 10.6734, 8.1479, off);
        switch3.draw(g2d);

        Rectangle switch4 = new Rectangle(900.2305, 48.68, 10.6734, 7.5615, on);
        switch4.draw(g2d);
    }

/** 
* assigns a new value for the variables
*/
    public void onLight() {
        on = Color.LIGHT_GRAY;
        off = Color.WHITE;
    }

/** 
* resets the values of the variables
*/
    public void offLight() {
        on = Color.WHITE;
        off = Color.LIGHT_GRAY;
    }
}
