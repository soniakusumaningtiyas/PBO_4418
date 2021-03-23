/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class gameObjek {
    double width, height;
    int positionX, positionY, incrementX, finish;
    String run;
    
    Scanner get = new Scanner(System.in);
    
    void setDimension(){
        System.out.print("Masukkan Lebar        : ");
        width = get.nextDouble();
        System.out.print("Masukkan Tinggi       : ");
        height = get.nextDouble();
    }
    void setPosition(){
        System.out.print("Masukkan PosisiX      : ");
        positionX = get.nextInt();
        System.out.print("Masukkan PosisiY      : ");
        positionY = get.nextInt();
        System.out.print("Masukkan IncrementX   : ");
        incrementX = get.nextInt(); 
    }
    void incrementXfinish(){
        finish = positionX - incrementX;
        System.out.println("Current X position : "+positionX+
                " jika increment X : "+incrementX+
                " maka posisi sekarang  : "+finish);
        System.out.println("-----------------------------");
    }
}
