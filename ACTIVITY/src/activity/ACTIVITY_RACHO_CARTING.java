
package activity;

import java.util.Scanner;


public class ACTIVITY_RACHO_CARTING {

   
    public static void main(String[] args) {
       
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Enter the second number: ");
//        int num2 = scanner.nextInt();
//
//        double result = num1 + num2;
//
//        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);

         MeanCalculator meanCalculator = new MeanCalculator();

        meanCalculator.inputNumbers();
        double mean = meanCalculator.calculateMean();

        System.out.println("The mean is: " + mean);
    }
}
          
          
    

  