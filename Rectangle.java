/**
This rectangle class is one of my basic shapes.
It is essentially like a square, but has different width and height.
It also uses the Rectangle2D class.
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

public class Rectangle implements DrawingObject {
    private double x;
    private double y;
    private double w;
    private double h;
    private Color color;

/** 
* assigns all the values of the variable based on the argument
* @param x is the x-coordinate of the rectangle
* @param y is the y-coordinate of the rectangle
* @param w is the width of the rectangle
* @param h is the height of the rectangle
* @param color is the color of the rectangle
*/
    public Rectangle(double x, double y, double w, double h, Color color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    @Override

/** 
*  creates the rectangle shape from the Rectangle2D class
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, w, h);
        g2d.setColor(color);
        g2d.fill(rectangle);
    }
}
