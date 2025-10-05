import java.lang.*;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    
     int[] array = {1,2,3,4,5,6,7,88,77,65,54};
     System.out.print("Enter a number: ");
     int num = input.nextInt();
     
     boolean isTrue = isTrue(array,num);
     
     if(isTrue){
         System.out.print("Target Achived");
     }else{
         System.out.print("Target Not Achived");
     }
  
    
 
    }
    
    public static boolean isTrue(int[] arr, int num){
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                return true;
            }
         i++;   
         
        }
        return false;
    }
   
    
    
}
