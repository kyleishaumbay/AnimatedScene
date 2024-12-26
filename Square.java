/**
The square class creates a square using the Rectangle2D class.
This class can be used by other classes to create a square based on the 
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

public class Square implements DrawingObject {
    private double x;
    private double y;
    private double size;
    private Color color;

/** 
* assigns all the values from the argument
* @param x is the x-coordinate of the square
* @param y is the y-coordinate of the square
* @param size is the width and height of the square
* @param color is the color of the square
*/
    public Square(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    @Override
/** 
*  creates the instance of the square from the Rectangle2D class
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double square = new Rectangle2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(square);
    }
}
