import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner kallu = new Scanner(System.in);
           System.out.println("number de do yaar");
        int k = kallu.nextInt();
        System.out.println("number de do yaar");
        int j = kallu.nextInt();
        int i = 12;
        int b = 22;
        
        
        System.out.println(i+b);
        if(i > b){
            System.out.println("hey bro kya baat hai");
            
        }else{
            System.out.println("No You can't Go");
          
            }
          
        do{
            i+=1;
            System.out.println(i);
        }while(i<b);
        
            
        }
    }
