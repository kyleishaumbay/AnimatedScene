/**
This class is used for my animation.
It draws the shapes that will be the lights and stars in my program.
It will be executed once an event happens.
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

public class ShowStars implements DrawingObject {

    private double x;
    private int z;

/** 
* assigns a value to x
*/
    public ShowStars() {
        x = -50;
    }

    @Override
/** 
*  creates the shapes for the class
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {

        g2d.setColor(new Color(233, 215, 164, z));

        Path2D.Double candle1 = new Path2D.Double();
        candle1.moveTo(743.56, 326.35);
        candle1.curveTo(746.34, 326.68, 748.13, 337.78, 743.43, 339.54);
        candle1.lineTo(738.19, 338.63);
        candle1.curveTo(734.19, 335.39, 740.87, 326.02, 743.56, 326.35);

        Path2D.Double candle2 = new Path2D.Double();
        candle2.moveTo(772.88, 310.24);
        candle2.curveTo(775.66, 310.58, 777.45, 321.68, 772.75, 323.44);
        candle2.lineTo(767.51,322.53);
        candle2.curveTo(763.51, 319.29, 770.19, 309.92, 772.88, 310.24);
        g2d.fill(candle1);
        g2d.fill(candle2);

        Path2D.Double bulb = new Path2D.Double();
        bulb.moveTo(230.16, 304.73);
        bulb.lineTo(259.81, 304.73);
        bulb.curveTo(259.81, 308.93, 253.17, 312.34, 244.99, 312.34);
        bulb.curveTo(236.8, 312.34, 230.16, 308.93, 230.16, 304.73);
        g2d.fill(bulb);

        Circle outer = new Circle(481.0132, 17.7624, 30.92, new Color(233, 215, 164, z));
        Circle outer1 = new Circle(377.6187, 78.438, 30.92, new Color(233, 215, 164, z));
        Circle outer2 = new Circle(579.2368, 78.438, 30.92, new Color(233, 215, 164, z));
        Circle outer3 = new Circle(350.7005, 179.84, 30.92, new Color(233, 215, 164, z));
        Circle outer4 = new Circle(609.155, 179.84, 30.92, new Color(233, 215, 164, z));
        Circle outer5 = new Circle(381.6187, 288.8873, 30.92, new Color(233, 215, 164, z));
        Circle outer6 = new Circle(578.2368, 288.8873, 30.92, new Color(233, 215, 164, z));
        Circle outer7 = new Circle(481.0132, 343.2568, 30.92, new Color(233, 215, 164, z));
        outer.draw(g2d);
        outer1.draw(g2d);
        outer2.draw(g2d);
        outer3.draw(g2d);
        outer4.draw(g2d);
        outer5.draw(g2d);
        outer6.draw(g2d);
        outer7.draw(g2d);

        Star s = new Star(x+68.633, 138.883, z);
         Star s1 = new Star(x+47.7281, 360.0269, z);
         Star s2 = new Star(x+153.3374, 32.7, z);
         Star s3 = new Star(x+119.9628, 387.1064, z);
         Star s4 = new Star(x+216.7821, 211.5235, z);
         Star s5 = new Star(x+243.9358, 516.5079, z);
         Star s6 = new Star(x+299.7823, 93.8971, z);
         Star s7 = new Star(x+389.9935, 23.3954, z);
         Star s8 = new Star(x+373.1045, 129.5785, z);
         Star s9 = new Star(x+478.8923, 269.0785, z);
         Star s10 = new Star(x+513.2446, 78.9829, z);
         Star s11 = new Star(x+544.6607, 148.6974, z);
         Star s12 = new Star(x+650.5637, 75.5454, z);
         Star s13 = new Star(x+632.9889, 242.5529, z);
         Star s14 = new Star(x+742.2913, 66.2409, z);
         Star s15 = new Star(x+686.9638, 298.7908, z);
         Star s16 = new Star(x+819.9557, 190.8178, z);
         Star s17 = new Star(x+853.0068, 472.4131, z);
         Star s18 = new Star(x+897.5607, 387.1064, z);
         Star s19 = new Star(x+965.0892, 170.5354, z);

         s.draw(g2d);
        s1.draw(g2d);
        s2.draw(g2d);
        s3.draw(g2d);
        s4.draw(g2d);
        s5.draw(g2d);
        s6.draw(g2d);
        s7.draw(g2d);
        s8.draw(g2d);
        s9.draw(g2d);
        s10.draw(g2d);
        s11.draw(g2d);
        s12.draw(g2d);
        s13.draw(g2d);
        s14.draw(g2d);
        s15.draw(g2d);
        s16.draw(g2d);
        s17.draw(g2d);
        s18.draw(g2d);
        s19.draw(g2d);
        }

/** 
* method that assigns the value s to z
* @param s is the opacity
*/
        public void show(int s) {
            z = s;
        }

/** 
* multiplies x to a negative so it changes sign and will then be in a different x-coordinate
*/
        public void flicker() {
                x = x * -1;
        }
        
    }
