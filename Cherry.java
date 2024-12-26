/**
The class cherry is one of my composite shapes.
It consists of other basic shape objects such as oval, line, and circle.
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

public class Cherry implements DrawingObject {
    private double x;
    private double y;
    private Color green;
    private Color pink;

/** 
* creating the instances of the colors and assigns the value based on the parameter
* @param x is the x-coordinate value that will be added to the x-coordinates of the shapes
* @param y is the y-coordinate value that will be added to the x-coordinates of the shapes
*/
    public Cherry(double x, double y) {
        this.x = x;
        this.y = y;
        green = new Color(170, 174, 141);
        pink = new Color(202, 158, 148);
    }

/** 
* creates and draws the shapes in the class
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Oval leaf1 = new Oval(x+1.0942, y+0, 6.5331, 1.8628, green);
        Oval leaf2 = new Oval(x+7.2182, y+0, 6.5331, 1.8628, green);
        leaf1.draw(g2d);
        leaf2.draw(g2d);

        Line stem1 = new Line(x+7.42, y+1.14, x+2.95, y+9.38, 2, green);
        Line stem2 = new Line(x+7.42, y+1.14, x+10.99, y+9.38, 2, green);
        stem1.draw(g2d);
        stem2.draw(g2d);

        Circle cherry1 = new Circle(x+0, y+8.9424, 5.8934, pink);
        Circle cherry2 = new Circle(x+8.0463, y+8.9424, 5.8934, pink);
        cherry1.draw(g2d);
        cherry2.draw(g2d);
    }
}
