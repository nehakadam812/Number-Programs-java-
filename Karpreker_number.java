//Karpreker Number

import java.util.Scanner;
class Karpreker_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");

int num=sc.nextInt();  // take integer value from user

int a=num*num;
int b=a;
int count=0;

while(b>0)    //the loop is execute until condition true
 {
  count++;     //increment value by 1
  b=b/10;
 }

if(count%2==0)   //check number of digit is even or odd
  {
    int d=1;
      for(int i=1;i<=count/2;i++)  //loop for find divider value
          {
            d=d*10;
           }
      int rem=a%d;               //determind the first half value
          a=a/d;                 //determind the second half value
      int sum=rem+a;
                     
      
         if(sum==num)             
                 {
                   System.out.println("Nmuber is Karpreker number");
                 }
          else
                {
                   System.out.println("Number is not Karpreker number");
                 }
    }
    else
                {
                   System.out.println("Number is not Karpreker number");
                 }
}
}             

/*  
       
       Output := 
           1)Enter the number value
             45
             Nmuber is Karpreker number

           2)Enter the number value
            297
            Number is not Karpreker number


*/