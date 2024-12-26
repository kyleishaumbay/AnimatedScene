/**
The line class creates a line using the Line2D class.
This class can be used by other classes to create a line based on the 
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

public class Line implements DrawingObject {
    private double x;
    private double y;
    private double x1;
    private double y1;
    private float thickness;
    private Color color;

/** 
* assigns all the values from the argument that is passed on
* @param x is the first x-coordinate of the line
* @param y is the first y-coordinate of the line
* @param x1 is the last x-coordinate of the line
* @param y1 is the last y-coordinate of the line
* @param thickness is the thickness of the line
* @param color is the color of the line
*/
    public Line(double x, double y, double x1, double y1, float thickness,Color color) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.thickness = thickness;
        this.color = color;
    }

/** 
* creates the instance of the line
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Line2D.Double line = new Line2D.Double(x, y, x1, y1);
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness)); 
        g2d.draw(line);
    }
}
