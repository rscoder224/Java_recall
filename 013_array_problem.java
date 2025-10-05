import java.lang.*;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int[] arr = {1,2,3,4,91,88,43,65};
    
    System.out.println("Welcome to array searching \n");
    
    System.out.print("Enter the Target ");
    int target = input.nextInt();
    
    int i = 0;
    while(i < arr.length){
        if(arr[i] == target){
            System.out.println(target + " Target Achived at index "+ i);
        }else{
            System.out.println("Target not achived!! ");
        }
        i++;
    }
 
    }
}
