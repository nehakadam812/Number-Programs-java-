//Magic number 

import java.util.Scanner;
class Magic_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");

int num=sc.nextInt();  // take integer value from user
int sum=0;  

while(num>0 || sum>9) //the loop is execute until condition true
 {
     if(num==0)
           {
              num=sum;
              sum=0;
           }
      int rem=num%10;    //sepreting digit
          sum=sum+rem;  //sum of digit
          num=num/10;
  }
  
        if(sum==1)             
               {
                   System.out.println("Nmuber is magic number");
                 }
          else
                {
                   System.out.println("Number is not magic number");
                 }
    
}
}             

/*
       Output := 
              1)Enter the number value
               1729
               Nmuber is magic number

              2)Enter the number value
               234
               Number is not magic number

*/