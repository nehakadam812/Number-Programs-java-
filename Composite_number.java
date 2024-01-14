// Composite Number

import java.util.Scanner;
class Composite_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");

int num=sc.nextInt();  // take integer value from user
int count=0;
if(num==0 || num==1)
        {
          count++;
         }


 for(int i=2;i<=num-1;i++)
       
      {  
        if(num%i==0)
                       
           {
              count++;
              break;

           }

     }
 
if(count>0)             
           {
              System.out.println("Nmuber is Composite Number");
           }
      else
             {
               System.out.println("Number is not Composite Number");
            }
 
}

}

/*
     Output:=
         1) Enter the number value
            46
            Nmuber is Composite Number

         2) Enter the number value
            97
            Number is not Composite Number


*/