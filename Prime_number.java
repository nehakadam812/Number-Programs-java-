//Prime Number

import java.util.Scanner;
class Prime_number{
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
 
if(count==0)             
           {
              System.out.println("Nmuber is Prime Number");
           }
      else
             {
               System.out.println("Number is not Prime Number");
            }
 
}

}

/*
     Output:=
         1) Enter the number value
            41
            Nmuber is Prime Number

         2) Enter the number value
            57
            Number is not Prime Number


*/