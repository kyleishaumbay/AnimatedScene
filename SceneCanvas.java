/**
The SceneCanvas class is the class where all the shape classes are drawn and
are passed to the frame. It also contains methods that will be 
used for my animation.
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

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SceneCanvas extends JComponent {

    private ArrayList<DrawingObject> elements;
    private Tinkerbell t;
    private Darker da;
    private ShowStars ss;
    private Switch sw;

/** 
* instantiates the canvas elements to be drawn
*/
    public SceneCanvas() {
        setPreferredSize(new Dimension(1024, 768));
        elements = new ArrayList<DrawingObject>();
        da = new Darker();
        sw = new Switch();
        t = new Tinkerbell(0, 0);
        ss = new ShowStars();
        elements.add(new Background());
        elements.add(new Drawer());
        elements.add(new Mirror());
        elements.add(new Objects());
        elements.add(new Chair());
        elements.add(sw);
        elements.add(da);
        elements.add(t);
        elements.add(ss);
    }

    @Override
/** 
* method that draws all the objects from the different classes
* @param Graphics g
* @return
*/
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).draw(g2d);
        }
    }

/** 
* method that can be called to get a Tinkerbell object
* @return t is the Tinkerbell object
*/
    public Tinkerbell getTinkerbell() {
        return t;
    }

/** 
* method that can be called to get a ShowStars object
* @return ss is the ShowStars object
*/
    public ShowStars getStars() {
        return ss;
    }

/** 
* method that can be called to get a Darker object
* @return da is the Darker object
*/
    public Darker getDark() {
        return da;
    }

/** 
* method that can be called to get a Switch object
* @return sw is the Switch object
*/    
    public Switch getSwitch() {
        return sw;
    }
    
}
