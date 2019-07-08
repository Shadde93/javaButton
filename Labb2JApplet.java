
//package mybutton;

import FirstPkg.*; // tänk på att FirstPkg.* importerar allt i mappen FirstPkg
import javax.swing.JApplet;

/**
 *
 * @author shadmana
 */
public class Labb2JApplet extends JApplet {

    MyButton button;
    public void init(){
        button = new MyButton();
        add(button);
        setVisible(true);
    }
}