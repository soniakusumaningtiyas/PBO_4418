/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori.Transportasi;

/**
 *
 * @author ACER
 */
public class Car {
    double speed ;
    String color;
    String Plate;
    public Car(){
    }
    public void Car(){
        System.out.println("belok kiri,, ");
    }
    public void GetColor(String newColor){
        color = newColor;
        System.out.println("Warna : " + color);
    }
    public void GetSpeed(double newSpeed){
        speed = newSpeed;
        System.out.println("Kecepatan : " + speed);
    }
    public void GetPlate (String newPlate){
        Plate = newPlate;
        System.out.println("Nomor Plat : " + Plate);
    }
}
