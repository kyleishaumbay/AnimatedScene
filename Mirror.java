/**
The mirror class creates the vanity mirror of my program.
It consists of my oval, circle, and line objects.
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

public class Mirror implements DrawingObject {

    private Color pink;
    private Color white;
    private Color gray;

/** 
*  instantiates the colors
*/
    public Mirror() {
        white = new Color(240, 241, 240);
        pink = new Color(224, 169, 173);
        gray = new Color(219, 221, 218);
    }

    @Override

/** 
*  creates the instances of all the shapes for the mirror
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Oval face = new Oval(353.6629, 21.7624, 283.2045, 347.5692, pink);
        face.draw(g2d);

        Oval face1 = new Oval(377.6187, 44.3413, 235.2931, 301.9155, gray);
        face1.draw(g2d);

        Circle outer = new Circle(481.0132, 17.7624, 30.92, white);
        Circle outer1 = new Circle(377.6187, 78.438, 30.92, white);
        Circle outer2 = new Circle(579.2368, 78.438, 30.92, white);
        Circle outer3 = new Circle(350.7005, 179.84, 30.92, white);
        Circle outer4 = new Circle(609.155, 179.84, 30.92, white);
        Circle outer5 = new Circle(381.6187, 288.8873, 30.92, white);
        Circle outer6 = new Circle(578.2368, 288.8873, 30.92, white);
        Circle outer7 = new Circle(481.0132, 343.2568, 30.92, white);
        outer.draw(g2d);
        outer1.draw(g2d);
        outer2.draw(g2d);
        outer3.draw(g2d);
        outer4.draw(g2d);
        outer5.draw(g2d);
        outer6.draw(g2d);
        outer7.draw(g2d);

        Line l = new Line(485.98, 174.72, 466.8, 198.05, 1, Color.GRAY);
        Line l1 = new Line(533.47, 161.26, 459.94, 246.14, 1, Color.GRAY);
        Line l2 = new Line(525.14, 206.97, 506.01, 230.3, 1,  Color.GRAY);
        l.draw(g2d);
        l1.draw(g2d);
        l2.draw(g2d);
    }
}
