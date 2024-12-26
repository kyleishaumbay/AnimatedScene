/**
The interface DrawingObject is implemented by my shape classes as a method
of drawing the shapes.
This is used since all of my shape classes need a draw method.
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

public interface DrawingObject {

/** 
* interface method that can be implemented to draw
* @param Graphics2D g2d
*/
    void draw(Graphics2D g2d);
}