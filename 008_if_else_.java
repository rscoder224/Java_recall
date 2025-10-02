// if else 
import java.lang.*;
import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Your age Here: ");
       int age = input.nextInt();
       
       if(age<18){
         System.out.print("You Can't cast vote");
        
       }else{
           System.out.print("You can cast the vote");
       }
       
        
        
        
    }
}
