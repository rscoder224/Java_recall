import java.lang.*;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt() ;
       
        String love = (age > 18) ? "You can drink cofee" : "You can drink milk only";
        System.out.print(love);
        
    }
}
