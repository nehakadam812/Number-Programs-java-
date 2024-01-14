// Palindromic Number

import java.util.Scanner;
class Palindromic_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");

int num=sc.nextInt();  // take integer value from user
int a=num;
int rev=0;

while(a>0)
   {
     int rem=a%10;
         rev=rev*10+rem;
         a=a/10;
    }

       if(rev==num)             
           {
              System.out.println("Nmuber is Palindromic Number");
           }
      else
             {
               System.out.println("Number is not Palindromic Number");
            }
    
}

}



/*  Output:=
         1) Enter the number value
            121
          Nmuber is Palindromic Number

         2) Enter the number value
            234
          Number is not Palindromic Number
*/
