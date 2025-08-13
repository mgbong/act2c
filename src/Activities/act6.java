package Activities;

import java.util.Scanner;

public class act6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        float hr, th, gww;
        double sss,wage;
        
        System.out.print("Enter hourly rate: ");
        hr = sc.nextInt();
        System.out.print("Enter total hours worked this week: ");
        th = sc.nextInt();
        
   
         gww= hr*th;
         sss= gww * 0.10;
         wage= gww - sss;
        
        System.out.println("----Wage Summary---- ");
        System.out.println("Employee: " +name);
        System.out.println("Hourly Rate: ₱" +hr);
        System.out.println("Hours Worked: " +th);
        System.out.println("Gross Weekly Wage: ₱ " +gww);
        System.out.println("SSS Contribution (10%): ₱" +sss);
        System.out.println("----------------------- ");
        System.out.println("Net Weekly Wage: ₱"+wage);
        
    }
    
}