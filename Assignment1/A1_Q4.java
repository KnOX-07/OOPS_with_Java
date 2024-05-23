//Q.4) Write a java program to print first 10 numbers in Fibonacci series. 
//Also print their sum.

import java.io.*;

class A1_Q4
{
   public static void main(String args[])  
   {    
 	int a=0, b=1, c=0, count=10, sum=1;    
	System.out.println("Fibonacci series:-");
 	System.out.print(a+" "+b);//to print 0 and 1
    
 	//loop starts from 2 because 0 and 1 are already printed
 	for(int i=2;i<count;i++)    
 	{    
  		c = a + b;
		System.out.print(" "+c);
		a = b;    
  		b = c;
		sum = sum + c;            
 	}
	System.out.println("\nThe sum is: "+sum); 
   }
}