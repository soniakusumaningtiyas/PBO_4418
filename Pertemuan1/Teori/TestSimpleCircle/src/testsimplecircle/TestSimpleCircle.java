/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimplecircle;

/**
 *
 * @author ACER
 */
public class TestSimpleCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleCircle circle1 = new SimpleCircle ();
        System.out.println("the area of the circle of radius"
        + circle1.radius + "is" + circle1.getArea());
        
        SimpleCircle circle2 = new SimpleCircle (25);
        System.out.println("the area of the circle of radius"
        + circle2.radius + "is" +circle2.getArea());
        
        SimpleCircle circle3 = new SimpleCircle (125);
        System.out.println("the area of the circle of radius"
        + circle3.radius + "is" +circle3.getArea());
        
        circle2.radius = 130;
        System.out.println("the area of the circle of radius"
        + circle2.radius + "is" +circle2.getArea());
        
        
                
        
                
    }
    
}
