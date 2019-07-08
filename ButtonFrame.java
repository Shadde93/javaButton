package mybutton;

import FirstPkg.MyButton; // skriv FirstPkg.* för att importera allt i FirstPkg mappen !! OBS !!!!!
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;        

public class ButtonFrame extends JFrame implements ActionListener{//Action implementeras för att få vet när knappen trycks
    //skapas en ny knapp nedan
    private JButton Button; 
    
    
    public ButtonFrame(){
        setPreferredSize(new Dimension(500, 500));//gör framen större
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// stänger allt när man klickar på kryss på framen, stänger av programmet
        Button = new MyButton();
        add(Button);//lägger knappet i frame
        pack();//tar alla komponetern layoutar dem så att de ligger rätt
        setVisible(true);//ser till att materialer visa i Frame
        //Button.addActionListener(this); 
    }
    
     public void actionPerformed(ActionEvent e){
        ((MyButton) Button).toggleState(); //byter tillstånd
    }
     
    public static void main(String[] args){
        new ButtonFrame();
}
   
}


    
