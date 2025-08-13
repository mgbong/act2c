
package Activities;

import java.util.Scanner;


public class airFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        float far,  tf, km, disc;
       
        System.out.print("Distance (km): ");
        float dis = sc.nextFloat();
        System.out.print("Class: ");
        int cl = sc.nextInt();
      
        
        if (cl == 1){
            far = 250;
            tf = far * dis;
             if ( dis >= 1000){
                disc = (float) ((far * dis) * 0.10);
                tf = tf - disc;
             }
            System.out.print("Total Fare: " + tf);
        }else if( cl == 2){
            far = 500;
            tf = far * dis;
            if ( dis >= 1000){
                disc = (float) ((far * dis) * 0.10);
                tf = tf - disc;
            }
            System.out.print("Total Fare: " + tf);
        }
    }
}
    

        
    

