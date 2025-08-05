package Activities;

import java.util.Scanner;


public class activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter birth year: ");
        int byear = sc.nextInt();
        
        System.out.println("\nHello "+name+" your age is "+(2025-byear));
        
        if ((2025-byear) >= 18){
            System.out.println("Votable");
        }else{
            System.out.println("Minority");
        }
    }   
}


