//Reverse Number


import java.util.Scanner;
class Reverse_number{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number value");
int num=sc.nextInt();
int b=num;
int rev=0;

while(b>0)
{
 
int rem=b%10;
rev=rev*10+rem;
b=b/10;

}

System.out.println("Reverse of number "+ rev);
}
}


/*  Output:=
        Enter the number value
        123
        Reverse of number 321

*/