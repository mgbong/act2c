
package Activities;

import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        float s, h, m, so, a;
                
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter marks in Science: ");
        s = sc.nextInt();
        System.out.print("Enter marks in History: ");
        h = sc.nextInt();
        System.out.print("Enter marks in Math: ");
        m = sc.nextInt();
        System.out.print("Enter marks in Soc: ");
        so = sc.nextInt();
        System.out.print("Enter marks in Arts: ");
        a = sc.nextInt();
        
        float total = s + h + m + so + a;
        System.out.println("\nTotal Marks: " + total);
        
        float per= total/5.0f;
        System.out.printf("Total percentage: %.2f", per);
        
        String Remarks;
        
        if( per < 70 ){
            System.out.println("\nRemarks: Fail");
            System.out.println("Try Again");
        }else if( per < 76 ){
            System.out.println("\nRemarks: Poor");
            System.out.println("\nCongratulations "+name+" you passed");
        }else if( per < 81 ){
            System.out.println("\nRemarks: Fair");
            System.out.println("\nCongratulations "+name+" you passed");
        }else if( per < 86 ){
            System.out.println("\nRemarks: Good");
            System.out.println("\nCongratulations "+name+" you passed");
        }else if( per < 91 ){
            System.out.println("\nRemarks: Very Good");
            System.out.println("\nCongratulations "+name+" you passed");
        }else{
            System.out.println("\nRemarks: Excellent");
            System.out.println("\nCongratulations "+name+" you passed");
        } 
    }
}

