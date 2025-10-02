// taking input in Java 
import java.lang.*;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter You name Here: ");
         String name = input.nextLine();
         System.out.print("Enter Your Age Here: ");
         int age = input.nextInt();
         
         System.out.print("Your name is " + name + " Your age is " + age);
         
         input.close();
         
    }
}

