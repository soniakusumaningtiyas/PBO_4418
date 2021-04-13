/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class car extends MotorVehicle{
    boolean sabukpengaman = false;
    
    public car (){
    }
    public void setsabukpengaman (int sabukpengaman){
        if(sabukpengaman == 1){
            this.sabukpengaman = true;
        }else if(sabukpengaman == 0){
            this.sabukpengaman= false;
        }
    }
    boolean getsabukpengaman(){
        return this.sabukpengaman;
    }
    }
