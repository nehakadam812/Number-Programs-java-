//Ugly number 

import java.util.Scanner;
class Ugly_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");

int num=sc.nextInt();  // take integer value from user
 

        if(num%2==0 || num%3==0 || num%5==0)   //condition for ugly number         
               {
                   System.out.println("Nmuber is Ugly number");
                 }
          else
                {
                   System.out.println("Number is not Ugly number");
                 }
    
}
}             

/*
       Output := 
           1)Enter the number value
             18
             Nmuber is Ugly number

           2)Enter the number value
             13
             Number is not Ugly number

*/