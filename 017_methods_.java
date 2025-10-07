
import java.lang.*;

public class Car{
    int fuel;
 public void drive(){
  
     if(fuel == 0){
         System.out.print("Car is Running Out of Fuel");
     }else{
         if(fuel < 5){
             System.out.print("car is in reserve mode");
         }else{
             System.out.print("Car is Driving");
         }
     }
 }
 
 public static void main(String[] args){
 Car mycar = new Car();
 mycar.fuel = 10;
 
 mycar.drive();
 

 }
 
}
