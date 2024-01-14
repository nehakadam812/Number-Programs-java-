//Buzz Number

import java.util.Scanner;
class Buzz_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");

int num=sc.nextInt();  // take integer value from user

int rem=num%10;

        if(num%7==0 || rem==7 )             
               {
                   System.out.println("Nmuber is Buzz Number");
                 }
          else
                {
                   System.out.println("Number is not Buzz Number");
                 }
    
}
}             

/*
    Output:=
           
        1) Enter the number value
          2834
          Number is not Buzz Number

        2) Enter the number value
           5687
           Nmuber is Buzz Number

*/