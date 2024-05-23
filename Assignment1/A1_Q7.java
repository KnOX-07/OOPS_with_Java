// Q.7) Write a java program to print sum of n terms in the series 
// 1/1! +1/2!+1/3!.....

import java.util.*;

class A1_Q7{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        double sum = 0;
        double fact = 1;

        for(int i = 1; i <= n; i++){
            fact = fact * i;
            System.out.print("1/" +i+ "!"+((i == n)? "" : " + "));
            sum += 1.0/fact;
        }
        System.out.println("\nSum of the series for "+n+" terms: " +sum);
        sc.close();
    }
}