/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik_PPT;

/**
 *
 * @author ACER
 */
import java.awt.*;
import java.awt.event.*;
public abstract class Contoh1{  
    TextField t1,t2;  
    Contoh1(){
        Frame f = new Frame();
        t1 = new TextField("Welcome to Javatpoint.");  
        t1.setBounds(50,100, 200,30);  
        t2=new TextField("AWT Tutorial");  
        t2.setBounds(50,150, 200,30);  
        f.add(t1); f.add(t2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
        }
    });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Contoh1() {
        };
    
        }
}
