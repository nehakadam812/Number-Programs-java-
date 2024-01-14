//Spy Number 

import java.util.Scanner;
class Spy_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");

int num=sc.nextInt();  // take integer value from user

int sum=0;
int mul=1;

while(num>0)
     {
       int rem=num%10;
       sum=sum+rem;
       mul=mul*rem;
       num=num/10;
      }

  if(sum==mul)             
           {
              System.out.println("Nmuber is Spy Number");
           }
      else
             {
               System.out.println("Number is not Spy Number");
            }
    
}

}


/*  Output:=
         1) Enter the number value
          1124
          Nmuber is Spy Number

         2) Enter the number value
          217
          Number is not Spy Number

*/