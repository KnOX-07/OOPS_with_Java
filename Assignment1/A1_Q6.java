// Q.6) Write a java program to print all natural prime numbers 
//up to the given prime number.

import java.util.*;

class A1_Q6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a prime number: ");
        int pno = sc.nextInt();
        sc.close();

        System.out.println("Prime numbers up to "+pno+":");
        for(int i = 2; i <= pno; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i + " ");
            }
        }
    }
}