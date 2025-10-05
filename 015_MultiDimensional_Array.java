// MultiDimensional Array and 2D array;

import java.lang.*;

import java.util.Scanner;

public class main {
//   hetrogenious Array;
  public static void main(String[] args){
  int[][] arr = {{1,2,3} , {4,5,6}};
//   System.out.print(arr[0][1]);
 
 int i = 0;
 
 while(i < arr.length){
     
     int j = 0;
     while( j < arr[i].length){
         System.out.println(arr[i][j]);
         j++;
     }
     
     i++;
     
 }
 
 
    }
    
}
