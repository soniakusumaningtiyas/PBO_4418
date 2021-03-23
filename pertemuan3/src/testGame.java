/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class testGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         gameObjek gamePlayer = new gameObjek();
        gameObjek gameEnemy = new gameObjek();
        
        System.out.println("========MASUKKAN DATA========");
        
        System.out.println("---------Game Player---------");
        gamePlayer.setDimension();
        gamePlayer.setPosition();
        gamePlayer.run = "Player is Running...";
        System.out.println(""+gamePlayer.run);
        
        System.out.println("---------Game Enemy---------");
        gameEnemy.setDimension();
        gameEnemy.setPosition();
        gameEnemy.run = "Enemy is Running...";
        System.out.println(""+gameEnemy.run);
        
        System.out.println("\n======DATA YANG DIDAPAT======");
        
        System.out.println("Lebar (Game Player)   : "+gamePlayer.width);
        System.out.println("Tinggi (Game Player)  : "+gamePlayer.height);
        System.out.println("PosisiX (Game Player) : "+gamePlayer.positionX);
        System.out.println("PosisiY (Game Player) : "+gamePlayer.positionY);
        System.out.print(""+gamePlayer.run);
        gamePlayer.incrementXfinish();
        
        System.out.println("Lebar (Game Enemy)    : "+gameEnemy.width);
        System.out.println("Tinggi (Game Enemy)   : "+gameEnemy.height);
        System.out.println("PosisiX (Game Enemy)  : "+gameEnemy.positionX);
        System.out.println("PosisiY (Game Enemy)  : "+gameEnemy.positionY);
        System.out.print(""+gameEnemy.run);
        gameEnemy.incrementXfinish();       
    }
    
}
