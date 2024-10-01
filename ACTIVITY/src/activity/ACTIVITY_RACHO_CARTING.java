
package activity;

import java.util.Scanner;


public class ACTIVITY_RACHO_CARTING {

   
    public static void main(String[] args) {

      
        Scanner scn = new Scanner (System.in);
        
         System.out.println("Enter the radius of the circle:");
         
        double radius = scn.nextDouble();
        
        double area= Math.PI * radius * radius;
        
        System.out.println("The area of the circle is:"+ area);
    }
        
        
    }
    

