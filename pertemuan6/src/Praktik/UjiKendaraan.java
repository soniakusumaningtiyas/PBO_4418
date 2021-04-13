/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class UjiKendaraan {
    public static void operasikan(Vehicle vehikel){
        vehikel.goStraight();

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda = new Bicycle();
        MotorVehicle mtr = new MotorVehicle();
        Vehicle vehikell = new Vehicle();
        car carr = new car();
        
        System.out.println("========== *** ==========");
        System.out.println(sepeda.speed);
        System.out.println(sepeda.color);
        sepeda.turnRight();
        sepeda.ringBell();
        
        System.out.println("========== *** ==========");
        
        System.out.println(mtr.speed);
        System.out.println(mtr.color);
        System.out.println(mtr.licencePlate);
        System.out.println(mtr.sizeofEngine);
        mtr.turnLeft();
        System.out.println(mtr.getLicencePlate());
        System.out.println(mtr.getSizeofEngine());
        
        System.out.println("========== *** ==========");
        
        vehikell.goStraight();
        vehikell.turnLeft();
        vehikell.turnLeft();
        
        System.out.println();
        
        System.out.println("========== *** ==========");
        
        carr.setsabukpengaman(0);
        System.out.println("sabukpengaman: " + carr.getsabukpengaman());
        carr.setsabukpengaman(1);
        System.out.println("sabukpengaman: " + carr.getsabukpengaman());
        
        System.out.println("========== *** ==========");
        
        System.out.println();
        operasikan(new Vehicle());
        operasikan(new Bicycle());
        operasikan(new MotorVehicle());
        operasikan(new car());
    }
    
}
