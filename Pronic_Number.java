//Pronic Number

import java.util.Scanner;
class Pronic_Number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");

int num=sc.nextInt();  // take integer value from user
int count=0;
for(int i=1;i<num;i++)
   {
      if(i*(i+1)==num)
       {
         count++;
         break;
       }
   }
  if(count ==1)             
           {
              System.out.println("Nmuber is Pronic Number");
           }
      else
             {
               System.out.println("Number is not Pronic Number");
            }
    
}

}



/*  Output:=
         1) Enter the number value
            6
            Nmuber is Pronic Number

         2) Enter the number value
             45
            Number is not Pronic Number
*/