/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class TestTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV tv1= new TV();
        tv1.TurnOn();
        tv1.setchannel(30);
        tv1.setvolume(3);
        
        TV tv2 = new TV();
        tv2.TurnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
       
    System.out.println("tv1's channel is" + tv1.channel
    +"and volum is " + tv1.volume);
        
    System.out.println("tv2's channel is" + tv2.channel
    +"and volume is " + tv2.volume);
        
    }
    
}
