// composite shapes 1
/**
The objects class conists of all the objects on the vanity drawer.
Some of these can be considered composite shapes since I used 2 or 
more of my basic shapes to draw it.
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

public class Objects implements DrawingObject {
    private Color candleColor1;
    private Color candleColor2;
    private Color glass;
    private Color brushColor1;
    private Color brushColor3;
    private Color vaseColor;
    private Color bullet;
    private Color lip;
    private Color bottleColor1;
    private Color bottleColor2;
    private Color label;
    private Color bottleColor3;
    private Color green;
    private Color pink;
    

/** 
* instantiates the colors
*/
    public Objects() {
        candleColor1 = new Color(233, 191, 168);
        candleColor2 = new Color(244, 202, 189);
        glass = new Color(165, 185, 192);
        brushColor1 = new Color(226, 184, 155);
        brushColor3 = new Color(224, 126, 129);
        vaseColor = new Color(211, 138, 131);
        bullet = new Color(189, 180, 173);
        lip = new Color(116, 46, 58);
        bottleColor1 = new Color(172, 211, 214);
        bottleColor2 = new Color(249, 231, 227);
        label = new Color(155, 147, 144);
        bottleColor3 = new Color(205, 208, 213);
        green = new Color(77, 84, 59);
        pink = new Color(203, 123, 142);
    }

    @Override

/** 
*  creates and draws all the shapes and objects of the class
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {

        //candle
        Square candle1 = new Square(724.0904, 348.0981, 34.3066, candleColor2);
        Square candle2 = new Square(746.1107, 332.8271, 44.7363, candleColor1);
        candle2.draw(g2d);
        candle1.draw(g2d);

        Line string1 = new Line(740.87, 339.5, 740.87, 348.09, 3, new Color(240, 241, 240));
        Line string2 = new Line(769.96, 323.12, 769.96, 332.83, 3, new Color(240, 241, 240));
        string1.draw(g2d);
        string2.draw(g2d);

        //makeup brushes
        Line handle1 = new Line(527.7, 306.58, 539, 362.74, 7, brushColor1);
        handle1.draw(g2d);

        Line handle2 = new Line(553.2, 310.47, 548.41, 362.74, 7, new Color(233, 180, 171));
        handle2.draw(g2d);

        Line handle3 = new Line(567.87, 299.57, 562.31, 363.67, 7, brushColor3);
        handle3.draw(g2d);

        Path2D.Double brush1 = new Path2D.Double();
        brush1.moveTo(532.37, 300.3);
        brush1.lineTo(530.6, 308.61);
        brush1.lineTo(525.75, 309.5);
        brush1.lineTo(520.09, 302.44);
        brush1.curveTo(520.0159, 300.0012, 523.1732, 297.6984, 525.4611, 297.1165);
        brush1.curveTo(527.9001, 296.4936, 531.3992, 297.8796, 532.3688, 300.2966);
        g2d.setColor(Color.GRAY);
        g2d.fill(brush1);

        Path2D.Double brush2 = new Path2D.Double();
        brush2.moveTo(560.09, 308.83);
        brush2.lineTo(554.28, 313.56);
        brush2.lineTo(551.66, 313.19);
        brush2.lineTo(547.52, 307.6);
        brush2.curveTo(547.92, 307.24, 550.48, 305.06, 554.2, 305.5);
        brush2.curveTo(557.78, 305.89, 559.76, 308.39, 560.09, 308.83);
        g2d.fill(brush2);

        Oval brush3 = new Oval(562.0247, 282.3868, 10.7682, 21.9632, Color.GRAY);
        brush3.draw(g2d);

        Rectangle box = new Rectangle(521.77, 334.66, 50.0624, 48.4499, glass);
        box.draw(g2d);

        //vase
        Line stem = new Line(320.46-14, 292.62, 328.24-14, 353.97, 3, green);
        Line stem1 = new Line(327.03-14, 306.25, 323.6-14, 313.92, 3, green);
        Line stem2 = new Line(318.44-14, 303.02, 322.58-14, 309.3, 3, green);
        Line stem3 = new Line(325.21-14, 295.12, 321.95-14, 301.71, 3, green);
        Line stem4 = new Line(314.06-14, 291.52, 320.51-14, 295.97, 3, green);
        Line stem5 = new Line(332.76-14, 283.05, 333.98-14, 355.88, 3, green);
        Line stem6 = new Line(328.24-14, 302.63, 333.24-14, 311.73, 3, green);
        Line stem7 = new Line(338.65-14, 295.97, 333.14-14, 305.63, 3, green);
        Line stem8 = new Line(327.03-14, 287.8, 333.02-14, 298.42, 3, green);
        Line stem9 = new Line(339.27-14, 281.37, 333.14-14, 292.2, 3, green);
        stem.draw(g2d);
        stem1.draw(g2d);
        stem2.draw(g2d);
        stem3.draw(g2d);
        stem4.draw(g2d);
        stem5.draw(g2d);
        stem6.draw(g2d);
        stem7.draw(g2d);
        stem8.draw(g2d);
        stem9.draw(g2d);

        Circle pop = new Circle(315.7042-14, 299.6884, 4.8024, pink);
        Circle pop1 = new Circle(311.2334-14, 289.0746, 4.8024, pink);
        Circle pop2 = new Circle(317.7452-14, 288.7011, 4.8309, pink);
        Circle pop3 = new Circle(322.7947-14, 292.2007, 4.8309, pink);
        Circle pop4 = new Circle(324.414-14, 303.9789, 4.831, pink);
        Circle pop5 = new Circle(325.2244-14, 299.6884, 4.8024, pink);
        Circle pop6 = new Circle(323.9567-14, 284.1858, 4.8024, pink);
        Circle pop7 = new Circle(330.3552-14, 278.9238, 4.8024, pink);
        Circle pop8 = new Circle(337.3846-14, 277.7624, 4.8024, pink);
        Circle pop9 = new Circle(336.2469-14, 293.1077, 4.8024, pink);
        pop.draw(g2d);
        pop1.draw(g2d);
        pop2.draw(g2d);
        pop3.draw(g2d);
        pop4.draw(g2d);
        pop5.draw(g2d);
        pop6.draw(g2d);
        pop7.draw(g2d);
        pop8.draw(g2d);
        pop9.draw(g2d);

        Rectangle vase = new Rectangle(320.46-14, 314.5, 15.5697, 43.7567, vaseColor);
        Circle base = new Circle(307.1508-14, 342.0512, 46.6293, vaseColor);
        base.draw(g2d);
        vase.draw(g2d);

        //case
        Oval case1 = new Oval(375.54, 343.26, 30.0469, 23.2737, new Color(145, 181, 193));
        Oval case2 = new Oval(378.3221, 345.76, 24.4827, 18.2737, new Color(219, 221, 218));
        Oval case3 = new Oval(384.4523, 370.18, 31.3237, 22.233, new Color(145, 181, 193));
        Oval case4 = new Oval(384.0154, 365.33, 30.0469, 23.2737, new Color(145, 181, 193));
        Oval case5 = new Oval(388.45, 371.2789, 21.78, 11.8311, new Color(222, 133, 158));
        case1.draw(g2d);
        case2.draw(g2d);
        case3.draw(g2d);
        case4.draw(g2d);
        case5.draw(g2d);

        //lipstick
        Rectangle lip1 = new Rectangle(380.1887-14, 348.5936, 11.1795, 34.8616, bullet);
        lip1.draw(g2d);

        Rectangle lip2 = new Rectangle(381.3914-14, 337.1168, 8.2893, 11.142, lip);
        Oval lip3 = new Oval(380.9328-14, 328.6407, 8.8345, 12.1517, lip);
        lip2.draw(g2d);
        lip3.draw(g2d);

        //perfume bottle
        Rectangle bottle1 = new Rectangle(429.1146, 322.001, 49.6286, 63.9364, bottleColor1);
        bottle1.draw(g2d);

        Rectangle bottle2 = new Rectangle(436.8676, 338.5445, 34.8369, 34.6784, bottleColor2);
        bottle2.draw(g2d);

        Rectangle bottle3 = new Rectangle(445.0968, 359.7099, 18.632, 7.922, label);
        bottle3.draw(g2d);
        
        Rectangle bottle4 = new Rectangle(448.7335, 306.5763, 10.5582, 15.4247, bottleColor3);
        bottle4.draw(g2d);

        //lamp
        Line cord = new Line(244.81, 305.99, 244.89, 369.34, 3, Color.GRAY);
        cord.draw(g2d);

        Rectangle base1 = new Rectangle(213.87, 369.335, 65.4781, 8.23, new Color(236, 180, 188));
        base1.draw(g2d);

        Oval light = new Oval(230.162, 297.1136, 29.6496, 15.2257, new Color(240, 241, 240));
        light.draw(g2d);

        Path2D.Double shade = new Path2D.Double();
        g2d.setColor(new Color(236, 180, 188));
        shade.moveTo(215.54, 256.2);
        shade.lineTo(272.77, 256.2);
        shade.lineTo(291.52, 304.73);
        shade.lineTo(200.59, 304.73);
        shade.closePath();
        g2d.fill(shade);

        //bag
        Ellipse2D.Double handle = new Ellipse2D.Double(609.85, 309.4959, 58.1341, 58.1341);
        g2d.setColor(new Color(114, 131, 141));
        g2d.draw(handle);

        Path2D.Double bag = new Path2D.Double();
        g2d.setColor(new Color(189, 213, 227));
        bag.moveTo(598.93, 336.84);
        bag.lineTo(676.77, 336.6);
        bag.lineTo(690.77, 385.94);
        bag.lineTo(587.2, 385.94);
        bag.closePath();
        g2d.fill(bag);

        Path2D.Double flap = new Path2D.Double();
        g2d.setColor(new Color(114, 131, 141));
        flap.moveTo(598.93, 336.84);
        flap.lineTo(676.77, 336.6);
        flap.lineTo(640.07, 361.26);
        flap.closePath();
        g2d.fill(flap);

        Circle button = new Circle(632.7528, 358.71, 14.47, new Color(240, 241, 240));
        button.draw(g2d);

    }
}
