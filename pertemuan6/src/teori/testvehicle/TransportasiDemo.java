/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori.testvehicle;

/**
 *
 * @author ACER
 */
import teori.Transportasi.Car;
import teori.Transportasi.Byclce;
public class TransportasiDemo {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car vehicle1 = new Car();
        vehicle1.Car();
        vehicle1.GetSpeed(10);
        vehicle1.GetColor("blue");
        vehicle1.GetPlate("K 1206 YE");
        System.out.println("\n");
        
        Byclce vehicle2 = new Byclce();
        vehicle2.sepeda();
        vehicle2.GetSpeed(50);
        vehicle2.GetColor("yellow");
        vehicle2.GetSize(100);
    }
    
    
}
    
