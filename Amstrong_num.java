//Amstrong Number 

import java.util.Scanner;
class Amstrong_num{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number ");
int num=sc.nextInt();
int a=num;
int a1=num;
int count=0;
int sum=0;
while(a>0)
  {
      count++;
      a=a/10;
  }
while(a1>0)
{
int rem=a1%10;
int result=1;
     for(int i=1;i<=count;i++)
         {
            result=result*rem;
         }
     sum=sum+result;
    
     a1=a1/10;
}
if(num==sum)
   {
              System.out.println("Nmuber is Amstrong Number");
           }
      else
             {
               System.out.println("Number is not Amstrong Number");
            }
    
}
}

/*  Output:=
         1) Enter the number value
            1634
            Nmuber is Amstrong Number

         2) Enter the number value
            123
            Number is not Amstrong Number
*/




