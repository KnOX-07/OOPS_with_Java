// Q.9) Write a Java program that prints the season name corresponding to its month 
// number using If-else and switch-case statements.

import java.util.*;

class A1_Q9{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month(1-12): ");
        int month = sc.nextInt();
        sc.close();

        if(month >= 1 && month <= 12) 
        {
            if(month >= 3 && month <= 5)
                System.out.println("Spring");
            else if(month >= 6 && month <= 8)
                System.out.println("Summer");
            else if(month >= 9 && month <= 11)
                System.out.println("Autumn");
            else
                System.out.println("Winter");
        }else{
            System.out.println("Invalid month number.");
        }

        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month number.");
        }
    }
}