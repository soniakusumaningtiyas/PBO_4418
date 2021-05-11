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
public class UjiUniversitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;double b;double hasil;
        //Universitas univ1 = new Universitas();
        Dosen univ2 = new Dosen();
        Mahasiswa univ3 = new Mahasiswa();
        Matakuliah univ4 = new Matakuliah();
        Nilai  univ5 = new Nilai();
        MatakuliahPokok univ6 = new MatakuliahPokok();
        MatakuliahTambahan  univ7 = new MatakuliahTambahan();
        univ2.GetName();
        univ2.GetNamaDosen("Bapak Ardiawan");
        univ2.GetIDDosen(1208912333);
        univ2.GetNamaDosen("Ibu Galuh");
        univ2.GetIDDosen(1379966564);
        System.out.println("\n");
        univ3.GetNamaMhs("Bernadetta Sri Endah D P ");
        univ3.GetNim("A11201911678");
        System.out.println("A. Matakuliah yang diambil Mahasiswa atas nama Bernadetta Sri Endah : ");
        univ4.GetNamaMatkul("WEB");
        univ4.GetNamaMatkul("Kriptografi");
        univ4.GetNamaMatkul("Basis Data");
        System.out.println("1. Matakuliah Pokok  : ");
        univ6.GetNamaMatkul("WEB");
        univ6.GetNilai(90);
        univ6.GetNamaMatkul("Basis Data");
        univ6.GetNilai(85);
        a = 90+85;
        b = a/2;
        hasil = b+60/100;
        System.out.println("Nilai Akhir : " + hasil);
        System.out.println("2. Matakuliah Tambahan  : ");
        univ7.GetNamaMatkul("Kriptografi");
        univ7.GetNilai(95);
        hasil =  univ7.Nilai+40/100;
        System.out.println("Nilai Akhir : " + hasil);
        univ5.GetPredikat("A");
        System.out.println("\n");
        univ3.GetNamaMhs("Sonia Kusumaningtiyas");
        univ3.GetNim("A11201912067");
        System.out.println("A. Matakuliah yang diambil Mahasiswa atas nama Sonia Kusumaningtiyas : ");
        univ4.GetNamaMatkul("Kriptografi");
        univ4.GetNamaMatkul("WEB");
        univ4.GetNamaMatkul("Basis Data");
        System.out.println("1. Matakuliah Pokok  : ");
        univ6.GetNamaMatkul("WEB");
        univ6.GetNilai(80);
        univ6.GetNamaMatkul("Basis Data");
        univ6.GetNilai(75);
        a = 80+75;
        b = a/2;
        hasil = b+60/100;
        System.out.println("Nilai Akhir : " + hasil);
        System.out.println("2. Matakuliah Tambahan  : ");
        univ7.GetNamaMatkul("Kriptografi");
        univ7.GetNilai(90);
        hasil =  univ7.Nilai+40/100;
        System.out.println("Nilai Akhir : " + hasil);
        univ5.GetPredikat("A");
    }
    
}

    
    

