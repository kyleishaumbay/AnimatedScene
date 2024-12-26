/**
The background class serves as the wall and floor of the room in my design. 
It consists of shapes and colors that will be drawn as the background of my program.
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

public class Background implements DrawingObject {

    private Color tan;
    private Color blue;
    private Color darkBlue;

/** 
* background() instantiates the colors used for the class
*/
    public Background() {
        tan = new Color(237, 220, 203);
        blue = new Color(211, 226, 227);
        darkBlue = new Color(161, 175, 176);
    }

    @Override

/** 
*  instantiates and draws all the shapes in the class
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Rectangle wall = new Rectangle(0, 0, 1024, 768, blue);
        wall.draw(g2d);

        Rectangle wall1 = new Rectangle(1.3092, 623.4658, 1024, 18.221, darkBlue);
        wall1.draw(g2d);

        Rectangle floor = new Rectangle(2.1585, 642.8211, 1024, 125.1789, tan);
        floor.draw(g2d);

        for(double x = 10; x < 1024; x += 60) {
            for(double y = 10; y < 620; y += 120) {
            (new Cherry(x, y)).draw(g2d);
            }
        }

        for(double x = 25; x < 1024; x += 60) {
            for(double y = 65; y < 620; y += 120) {
            (new Cherry(x, y)).draw(g2d);
            }
        }
        
    }
}
