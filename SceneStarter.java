/**
This class basically is the one to be called to run everything.
It instantiates the frame and its method so that they will also run.
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

public class SceneStarter {
/** 
* the main method that runs the setUpGUI method from the instance of the SceneFrame
*/
    public static void main(String[] args) {
        SceneFrame sf = new SceneFrame();
        sf.setUpGUI();
        
    }
}