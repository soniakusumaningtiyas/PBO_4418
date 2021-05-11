/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author ACER
 */
public class Nilai extends Mahasiswa {
    String Predikat;
    int Angka;
    Nilai(){
    }
    public void GetPredikat(String newPredikat){
        Predikat = newPredikat;
        System.out.println("Predikat : " + Predikat);
    }
    public void GetAngka(int newAngka){
        Angka = newAngka;
        System.out.println("Predikat : " + Angka);
    }
}
    

