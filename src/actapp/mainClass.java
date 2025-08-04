package actapp;

import java.util.Scanner;
import banking.bankApp;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
       
                bankApp ba = new bankApp();
                
                System.out.print("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.print("Enter your Pin: ");
                int pin = sc.nextInt();
              
                    if(ba.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                    }else{
                        System.out.println("INVALID ACCOUNT!");
                    }
                
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
                
            
                
        
        }
            
    }
    
}
