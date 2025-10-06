

import java.lang.*;

// Instances Variables and Methods

public class Car{
    int noOfwheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    
    public void drive(){
        System.out.println("Car is Driving");
    }
    public void addFuel(float flue){
        currentFuelInLiters++;
    }
    
    public static void main(String[] args){
     Car mycar = new Car();
     mycar.drive();     
     mycar.addFuel(2);
     float val = mycar.currentFuelInLiters;
     System.out.println(val);
     
        
    }
}
