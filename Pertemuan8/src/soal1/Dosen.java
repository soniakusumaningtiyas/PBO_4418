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
public class Dosen implements Universitas {
    String NamaDosen;
    int ID_NIDN;
    Dosen(){
    }
    public void GetNamaDosen(String newNamaDosen){
        NamaDosen = newNamaDosen;
        System.out.println("Nama Dosen : " + NamaDosen);
    }
    public void GetIDDosen(int newID_NIDN){
        ID_NIDN = newID_NIDN;
        System.out.println("ID Dosen : " + ID_NIDN);
    }
    public void GetName(){
        System.out.println("Nama Universitas : Universitas Dian Nuswantoro");
    
    }
}
