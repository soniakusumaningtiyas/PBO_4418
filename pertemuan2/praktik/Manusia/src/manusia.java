/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       TV mnsia1 =new TV();
       mnsia1.NamaSaya("sonia");
       mnsia1.BeliTV();
       
       TV  mnsia2 = new TV();
       mnsia2.jualsemuaTV();
       mnsia2.cekTV(true);
       
       System.out.println("Nama :"+mnsia1.Nama);
       System.out.println("Beli Tv :"+mnsia1.punyaTV);
       System.out.println("Jual Tv :"+mnsia2.punyaTV);
       System.out.println("cek Tv :"+mnsia2.punyaTV);
         
    }
        
    
}
