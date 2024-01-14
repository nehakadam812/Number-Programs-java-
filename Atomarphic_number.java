//Atomarphic Number

import java.util.Scanner;
class Atomarphic_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
int b=a;
int count=0;
int rem=0;

int s=a*a;
while(b>0)
  {
        rem=b%10;
      	count++;
        b=b/10;
   }
int d=1;
for(int i=1;i<=count;i++)
{
  d=d*10;
}

s=s%d;
if(s==a)
    {
              System.out.println("Nmuber is Atomarphic Number");
           }
      else
             {
               System.out.println("Number is not Atomarphic Number");
            }
    
}
}

/*  Output:=
         1) Enter the number value
            76
            Nmuber is Atomarphic Number

         2) Enter the number value
            123
            Number is not Atomarphic Number
*/






