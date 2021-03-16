/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Buku {
    String judul,pengarang,penerbit;
    
    int  tahun;
    
    public Buku(String judul, String pengarang, String penerbit, int tahun){
    this.judul=judul;
    this.pengarang=pengarang;
    this.penerbit=penerbit;
    this.tahun=tahun;
    }
    
public void info(){
    System.out.println("judul:" +this.judul);
    System.out.println("judul:" +this.pengarang);
    System.out.println("judul:" +this.penerbit);
    System.out.println("judul:" +this.tahun);
    
}
}
