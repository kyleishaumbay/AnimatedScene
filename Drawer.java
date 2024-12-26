/**
The drawer class consists of shapes that are used to draw a vanity drawer.
I used some of my basic shape objects to create the actual shapes.
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

public class Drawer implements DrawingObject {
    private Color brown; // https://teaching.csse.uwa.edu.au/units/CITS1001/colorinfo.html
    private Color pink; // https://teaching.csse.uwa.edu.au/units/CITS1001/colorinfo.html

/** 
*  instantiates the colors
*/
    public Drawer() {
        brown = new Color(137, 95, 72);
        pink = new Color(224, 169, 173);
    }

    @Override

/** 
* creates and draws the instances of the shapes
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Rectangle leg1 = new Rectangle(195.9171, 396.411, 24.9487, 346.4233, brown);
        Rectangle leg2 = new Rectangle(769.9572, 396.411, 24.9487, 346.4233, brown);
        leg1.draw(g2d);
        leg2.draw(g2d);

        RoundRectangle2D round = new RoundRectangle2D.Double(183.0966, 358.7159, 624.3372, 37.695, 10, 10); 
        g2d.fill(round);

        Rectangle drawer = new Rectangle(220.8658, 396.411, 549.0914, 101.2494, pink);
        drawer.draw(g2d);

        Rectangle inner = new Rectangle(233.0686, 412.2737, 524.0591, 69.364, brown);
        inner.draw(g2d);

        Rectangle inner1 = new Rectangle(245.294, 423.9561, 123.395, 45.2692, pink);
        Rectangle inner2 = new Rectangle(394.584, 423.9561, 204.2418, 45.2692, pink);
        Rectangle inner3 = new Rectangle(624.9709, 423.9561, 121.1398, 45.2692, pink);   
        inner1.draw(g2d);
        inner2.draw(g2d);
        inner3.draw(g2d);

        Line line = new Line(382.56, 412.27, 382.56, 481.64, 1, pink); 
        Line line1 = new Line(610.85, 412.35, 610.85, 481.72, 1, pink);
        line.draw(g2d);
        line1.draw(g2d);

        Circle hold = new Circle(301.6357, 441.3598, 10.4618, brown);
        Circle hold1 = new Circle(680.3099, 441.3598, 10.4618, brown);
        Circle hold2 = new Circle(491.474, 441.3598, 10.4618, brown);
        hold.draw(g2d);
        hold1.draw(g2d);
        hold2.draw(g2d);
    }
}
