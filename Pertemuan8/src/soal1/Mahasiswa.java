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
public class Mahasiswa implements Universitas{
    String NamaMhs;
    String Nim;
    Mahasiswa(){
    }
    public void GetNamaMhs(String newNamaMhs){
        NamaMhs = newNamaMhs;
        System.out.println("Nama Mahasiswa : " + NamaMhs);
    }
    public void GetNim(String newNim){
        Nim = newNim;
        System.out.println("Nim : " + Nim);
    }
    public void GetName(){
        System.out.println("Nama Universitas : Universitas Dian Nuswantoro");
    }
}
