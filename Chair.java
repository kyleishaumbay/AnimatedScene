/**
This class draws the chair that can be found in my program.
It is a combination of rectangles and a closed curve path.
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

public class Chair implements DrawingObject {

    private Color pink;
    private Color brown;
    private Color white;

/** 
* a constructor that instantiates the class' colors
*/
    public Chair() {
        white = new Color(240, 241, 240);
        brown = new Color(137, 95, 72);
        pink = new Color(224, 169, 173);
    }

    @Override
/** 
*  instantiates and draws the shapes for the class
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Path2D.Double cushion = new Path2D.Double(); 
        cushion.moveTo(409.1139, 591.4384);
        cushion.curveTo(409.0099, 565.8456, 451.5249, 545.0985, 503.9698, 545.0985);
        cushion.curveTo(556.4148, 545.0985, 598.9298, 565.8456,  598.8257, 591.4384);
        g2d.setColor(white);
        cushion.closePath();
        g2d.fill(cushion);
       
        Rectangle chair1 = new Rectangle(409.1139, 591.4384, 189.7118, 20.436, brown);
        chair1.draw(g2d);

        Rectangle leg1 = new Rectangle(418.1966, 611.8743, 19.6791, 130.96, pink);
        leg1.draw(g2d);

        Rectangle leg2 = new Rectangle(569.9528, 611.8743, 19.6791, 130.96, pink);
        leg2.draw(g2d);
    }
}
