/**
The circle class creates a circle using the Ellipse2D class.
This class can be used by other classes to create a circle based on the 
argument passed to it.
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
import java.awt.geom.*;

public class Circle implements DrawingObject {
    private double x;
    private double y;
    private double size;
    private Color color;

/** 
* assigns all the values based on the parameter
* @param x is the x-coordinate of the circle
* @param y is the y-coordinate of the circle
* @param size is the width and height of the circle
* @param color is the color of the circle
*/
    public Circle(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    @Override
/** 
*  method that instantiates the Ellipse2D class
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(circle);
    }
}
