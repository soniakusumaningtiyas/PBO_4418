
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class TV extends TestTV {
    int channel;
    int volume;
    boolean  on = false;
    public TV(){
    }
    public void TurnOn(){
        on = true;
    }
    public void setchannel(int newchannel) {
        channel = newchannel;
    }
    public void setvolume(int newvolume) {
        volume = newvolume;
    }
    public void channelUp(){
        channel = channel+1;
    }
    public void channelDown(){
        channel = channel-1;
    }
    public  void volumeUp(){
        volume = volume+1;
    }
    public void volumeDown() {
        volume = volume-1;
    }
            
}

	
    

