import java.lang.*;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
    printTables();
        
    }
    public static void printTables(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a no. table you want to print ==>  ");
        int a = input.nextInt();
        System.out.print("Enter till where you want to print ==>  ");
        int b = input.nextInt();
        int c = 0;
        while(c <= b){
        System.out.println(a + " X " + c + " = " + (a*c));
        c++;
        }
        
    }
    
}
