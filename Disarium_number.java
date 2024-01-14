//Disarium Number

import java.util.Scanner;
class Disarium_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");

int num=sc.nextInt();  // take integer value from user
int count=0; 
int sum=0;
int b=num;
int rev=0;

while(b>0)
    {
          int rem=b%10;
          rev=rev*10+rem;
          b=b/10;
    }

while(rev>0)
  {
     int rem=rev%10;
      count++;
        int d=1;
        for(int i=1;i<=count;i++)
            {
              d=d*rem;
             }
       sum=sum+d;
       rev=rev/10;
       
   }
  
        if(sum==num)             
               {
                   System.out.println("Nmuber is Disarium number");
                 }
          else
                {
                   System.out.println("Number is not Disarium number");
                 }
    
}
}             

/*
       Output := 
           1)Enter the number value
              175
              Nmuber is Disarium number

           2)Enter the number value
             25
             Number is not Disarium number

*/