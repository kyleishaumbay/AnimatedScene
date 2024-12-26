/**
The tinkerbell class draws the character Tinkerbell.
It is made up of line paths (without the use of curves).
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

public class Tinkerbell implements DrawingObject {
    private double x;
    private double y;
    private int z;

/** 
* assigns the values
* @param x is the value added to the x-coordinate 
* @param y is the value added to the y-coordinate
*/
    public Tinkerbell(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
/** 
*  creates the path2D of the Tinkerbell character
* @param Graphics2D g2d
*/
    public void draw(Graphics2D g2d) {
        Path2D.Double wing1 = new Path2D.Double();
        g2d.setColor(new Color(204, 229, 255, z));
        wing1.moveTo(x+557.2462, y+120.6388);
        wing1.lineTo(x+542.1364, y+129.6437);
        wing1.lineTo(x+528.858,y+ 146.4324);
        wing1.lineTo(x+522.0304, y+158.9994);
        wing1.lineTo(x+519.5479, y+175.7364);
        wing1.lineTo(x+525.5003, y+172.5313);
        wing1.lineTo(x+541.5259, y+153.7584);
        wing1.closePath();
        g2d.fill(wing1);

        Path2D.Double wing2 = new Path2D.Double();
        wing2.moveTo(x+519.55, y+175.74);
        wing2.lineTo(x+525.5, y+172.53);
        wing2.lineTo(x+531.24, y+169.83);
        wing2.lineTo(x+537.08, y+169.53);
        wing2.lineTo(x+538.57, y+170.87);
        wing2.lineTo(x+538.87, y+173.87);
        wing2.lineTo(x+536.93, y+178.05);
        wing2.lineTo(x+533.64, y+181.19);
        wing2.lineTo(x+528.7, y+181.49);
        wing2.lineTo(x+524.52, y+181.19);
        wing2.closePath();
        g2d.fill(wing2);

        Path2D.Double wing3 = new Path2D.Double();
        wing3.moveTo(x+483.99, y+137.83);
        wing3.lineTo(x+493.86, y+147.7);
        wing3.lineTo(x+502.24, y+158.61);
        wing3.lineTo(x+506.42, y+163.55);
        wing3.lineTo(x+518.68,y+ 175.21);
        wing3.lineTo(x+504.78, y+155.02);
        wing3.lineTo(x+495.66, y+145.31);
        wing3.closePath();
        g2d.fill(wing3);

        Path2D.Double skin1 = new Path2D.Double();
        g2d.setColor(new Color(232, 190, 172, z));
        skin1.moveTo(x+510.4, y+173.5);
        skin1.lineTo(x+518.43, y+173.56);
        skin1.lineTo(x+526.36, y+174.23);
        skin1.lineTo(x+550.47, y+184.83);
        skin1.lineTo(x+552.7, y+181.82);
        skin1.lineTo(x+555.49, y+180.37);
        skin1.lineTo(x+558.06, y+179.92);
        skin1.lineTo(x+557.61, y+181.26);
        skin1.lineTo(x+554.38, y+182.6);
        skin1.lineTo(x+554.38, y+184.05);
        skin1.lineTo(x+557.28, y+183.71);
        skin1.lineTo(x+553.26, y+186.51);
        skin1.lineTo(x+549.8, y+187.84);
        skin1.lineTo(x+531.72, y+181.82);
        skin1.lineTo(x+527.03, y+180.14);
        skin1.lineTo(x+525.47, y+180.59);
        skin1.lineTo(x+525.47, y+184.27);
        skin1.lineTo(x+519.77, y+180.59);
        skin1.lineTo(x+517.14, y+187.67);
        skin1.lineTo(x+510.73, y+183.04);
        skin1.lineTo(x+510.73, y+185.61);
        skin1.lineTo(x+510.4, y+190.19);
        skin1.lineTo(x+509.28, y+196.77);
        skin1.lineTo(x+507.49, y+199.34);
        skin1.lineTo(x+503.14, y+199.45);
        skin1.lineTo(x+501.36, y+198.45);
        skin1.lineTo(x+503.03, y+197.56);
        skin1.lineTo(x+498.57, y+196.55);
        skin1.lineTo(x+500.46, y+195.43);
        skin1.lineTo(x+503.81, y+195.1);
        skin1.lineTo(x+506.38, y+195.32);
        skin1.lineTo(x+507.05, y+179.03);
        skin1.lineTo(x+511.07, y+175.68);
        skin1.closePath();
        g2d.fill(skin1);
        
        Path2D.Double skin2 = new Path2D.Double();
        skin2.moveTo(x+503.28, y+166.09);
        skin2.lineTo(x+504.63, y+166.39);
        skin2.lineTo(x+505.97, y+167.44);
        skin2.lineTo(x+507.62, y+169.98);
        skin2.lineTo(x+508.96,y+163.1);
        skin2.lineTo(x+511.36, y+160.56);
        skin2.lineTo(x+516.44, y+162.65);
        skin2.lineTo(x+520.33, y+163.25);
        skin2.lineTo(x+520.18, y+164.59);
        skin2.lineTo(x+519.88, y+168.18);
        skin2.lineTo(x+519.58, y+171.17);
        skin2.lineTo(x+518.68, y+174.02);
        skin2.lineTo(x+516.14, y+174.91);
        skin2.lineTo(x+514.05,y+ 175.06);
        skin2.lineTo(x+511.51,y+ 174.16);
        skin2.lineTo(x+508.67, y+171.92);
        skin2.lineTo(x+507.62, y+170.73);
        skin2.lineTo(x+504.93, y+169.98);
        skin2.lineTo(x+503.88, y+168.93);
        skin2.closePath();
        g2d.fill(skin2);

        Path2D.Double skin3 = new Path2D.Double();
        skin3.moveTo(x+523.79, y+205.7);
        skin3.lineTo(x+531.6, y+210.28);
        skin3.lineTo(x+546.56, y+228.14);
        skin3.lineTo(x+548.46, y+227.92);
        skin3.lineTo(x+548.79, y+235.95);
        skin3.lineTo(x+546.23, y+233.94);
        skin3.lineTo(x+545.45, y+231.04);
        skin3.lineTo(x+535.96, y+226.13);
        skin3.lineTo(x+532.05, y+223.23);
        skin3.lineTo(x+522.79, y+207.38);
        skin3.closePath();
        g2d.fill(skin3);

        Path2D.Double skin4 = new Path2D.Double();
        skin4.moveTo(x+541.2, y+198.78);
        skin4.lineTo(x+540.31, y+218.87);
        skin4.lineTo(x+542.77, y+222.89);
        skin4.lineTo(x+546.23, y+241.87);
        skin4.lineTo(x+547.45, y+242.31);
        skin4.lineTo(x+547.57, y+248.57);
        skin4.lineTo(x+544.11, y+248.23);
        skin4.lineTo(x+543.77, y+243.21);
        skin4.lineTo(x+536.85, y+226.46);
        skin4.lineTo(x+534.17, y+223.45);
        skin4.lineTo(x+530.82, y+206.71);
        skin4.lineTo(x+533.06, y+201.35);
        skin4.closePath();
        g2d.fill(skin4);

        Path2D.Double hair1 = new Path2D.Double();
        g2d.setColor(new Color(250, 226, 121, z));
        hair1.moveTo(x+523.29, y+165.13);
        hair1.lineTo(x+520.48, y+163.95);
        hair1.lineTo(x+516.71, y+163.29);
        hair1.lineTo(x+514.34, y+162.92);
        hair1.lineTo(x+511.76, y+160.85);
        hair1.lineTo(x+510.5, y+163.51);
        hair1.lineTo(x+509.39, y+165.06);
        hair1.lineTo(x+509.61, y+167.28);
        hair1.lineTo(x+507.77, y+166.02);
        hair1.lineTo(x+508.51, y+170.23);
        hair1.lineTo(x+505.33, y+167.72);
        hair1.lineTo(x+503.55, y+164.69);
        hair1.lineTo(x+503.11, y+159.96);
        hair1.lineTo(x+504.44, y+156.12);
        hair1.lineTo(x+507.17, y+153.68);
        hair1.lineTo(x+510.35, y+152.86);
        hair1.lineTo(x+512.64, y+153.01);
        hair1.lineTo(x+514.79, y+153.83);
        hair1.lineTo(x+517.08, y+154.79);
        hair1.lineTo(x+517.45, y+155.01);
        hair1.lineTo(x+520.33, y+155.6);
        hair1.lineTo(x+522.03, y+159);
        hair1.lineTo(x+523.51, y+162.47);
        hair1.closePath();
        g2d.fill(hair1);

        Ellipse2D.Double hair2 = new Ellipse2D.Double(x+500.3882, y+146.5914, 11.4425, 9.7937);
        g2d.fill(hair2);

        Path2D.Double dress = new Path2D.Double();
        g2d.setColor(new Color(177, 186, 66, z));
        dress.moveTo(x+519.33, y+179.14);
        dress.lineTo(x+524.01, y+181.82);
        dress.lineTo(x+525.47, y+183.83);
        dress.lineTo(x+525.91, y+187.06);
        dress.lineTo(x+527.14, y+188.74);
        dress.lineTo(x+537.3, y+189.52);
        dress.lineTo(x+546.67, y+196.77);
        dress.lineTo(x+541.32, y+195.1);
        dress.lineTo(x+544.44, y+199.79);
        dress.lineTo(x+537.52, y+201.57);
        dress.lineTo(x+538.86, y+207.71);
        dress.lineTo(x+532.72, y+205.48);
        dress.lineTo(x+530.15, y+212.74);
        dress.lineTo(x+524.35, y+206.93);
        dress.lineTo(x+520.78, y+210.73);
        dress.lineTo(x+520.44, y+204.7);
        dress.lineTo(x+518.43, y+193.87);
        dress.lineTo(x+515.87, y+191.75);
        dress.lineTo(x+512.07, y+188.74);
        dress.lineTo(x+510.73, y+186.39);
        dress.lineTo(x+512.07, y+182.38);
        dress.lineTo(x+514.42, y+183.83);
        dress.lineTo(x+516.65, y+186.51);
        dress.lineTo(x+518.32, y+181.26);
        dress.closePath();
        g2d.fill(dress);

        Ellipse2D.Double shoes1 = new Ellipse2D.Double(x+547.2963, y+227.6656, 4.1299, 11.3852);
        g2d.fill(shoes1);

        Ellipse2D.Double shoes2 = new Ellipse2D.Double(x+544.3438, y+242.2819, 4.1299, 11.3852);
        g2d.fill(shoes2);

        Ellipse2D.Double shoes3 = new Ellipse2D.Double(x+543.6173, y+233.0017, 5.9419, 5.9419);
        g2d.setColor(new Color(240, 241, 240, z));
        g2d.fill(shoes3);

        Ellipse2D.Double shoes4 = new Ellipse2D.Double(x+541.7952, y+245.9155, 5.9419, 5.9419);
        g2d.fill(shoes4);

        }

/** 
*  assigns the value of m to x
* @param m is an x-coordinate value to be added
*/
        public void moveH(double m) {
            x += m;
        }

/** 
*  assigns the value of m to y
* @param m is a y-coordinate value to be added
*/
        public void moveV(double m) {
            y +=m;
        }

/** 
*  assigns the value of s to z
* @param s is the transparency
*/
        public void show(int s) {
            z = s;
        }
}
