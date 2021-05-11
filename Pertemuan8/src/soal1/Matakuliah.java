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
public class Matakuliah extends Mahasiswa {
    String NamaMatkul;
    Matakuliah(){
    }
    public void GetNamaMatkul(String newNamaMatkul){
        NamaMatkul = newNamaMatkul;
        System.out.println("Nama MataKuliah : " + NamaMatkul);
    }
}
