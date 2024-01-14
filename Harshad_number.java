//Harshad number

import java.util.Scanner;
class Harshad_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");

int num=sc.nextInt();  // take integer value from user
int sum=0; 

int a=num; 

while(a>0)
 {
   int rem=a%10;
   sum=sum+rem;
   a=a/10;
 
}
  
        if(num%sum==0)             
               {
                   System.out.println("Nmuber is Harshad number");
                 }
          else
                {
                   System.out.println("Number is not Harshad number");
                 }
    
}
}             

/*
     Output :=
          1) Enter the number value
             171
             Nmuber is Harshad number

          2) Enter the number value
             353
             Number is not Harshad number

*/