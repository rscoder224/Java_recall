



 public class Person{
     String firstName;
     String lastName;
     int age;
     long number;
     public String fullName(String firstName, String lastName){
         return firstName + " " + lastName;
     }
    
    public static void main(String[] args){
       Person person = new Person();
       person.firstName = "Shaurya";
       person.lastName = "Tiwari";
       person.age = 21;
       person.number = 25553526;
       
    String res =  person.fullName(person.firstName,person.lastName);
    System.out.print(res);
             
    }
   
 }
