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
public class Byclce {
    double speed;
    String color;
    int size;
    public void sepeda(){
        System.out.println("maju..");
    }
    public void GetColor(String newColor){
        color = newColor;
        System.out.println("Warna : " + color);
    }
    public void GetSpeed(double newSpeed){
        speed = newSpeed;
        System.out.println("Kecepatan : " + speed);
    }
    public void GetSize(int newSize){
        size = newSize;
        System.out.println("Ukuran : " + size);
    }
}