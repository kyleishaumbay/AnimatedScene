/**
The class star is one of my basic shapes.
It creates a star/diamond like shape through the use of the Path2D class.
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

public class Star implements DrawingObject {

    private double x;
    private double y;
    private int z;

/** 
* assigns the values
* @param x is the x-coordinate of the new translation
* @param y is the y-coordinate of the new translation
* @param z is the opacity/transparency of the shape
*/
    public Star(double x, double y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
/** 
* creates the path2D for the shape star
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Path2D.Double star = new Path2D.Double();
        AffineTransform reset = g2d.getTransform();
        g2d.setColor(new Color(233, 215, 164, z));
        star.moveTo(9.89, 0);
        star.lineTo(11.79, 8.3);
        star.lineTo(20, 10);
        star.lineTo(12.01, 12.02);
        star.lineTo(9.89, 20);
        star.lineTo(7.93, 12.08);
        star.lineTo(0, 10.03);
        star.lineTo(8.04, 8.03);
        star.closePath();
        g2d.translate(x, y);
        g2d.fill(star);
        g2d.setTransform(reset);
}
}
