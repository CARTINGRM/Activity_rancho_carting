
package activity;

import java.util.Scanner;


public class ACTIVITY_RACHO_CARTING {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Program!");
        System.out.println("1. Calculate the sum of two numbers");
        System.out.println("2. Calculate the mean of a set of numbers");
        System.out.println("3. Get user's information");
//        System.out.println("4. Exit");

        System.out.print("\nEnter your choice: ");
        int choice = input.nextInt();
        input.nextLine(); // Consume newline left-over

        switch (choice) {
            case 1:
                calculateSum(input);
                break;
            case 2:
                calculateMean(input);
                break;
            case 3:
                getUserInformation(input);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        input.close();
    }

    public static void calculateSum(Scanner input) {
        System.out.print("\nEnter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        
        double result = num1 + num2 + num3;

        System.out.println("The sum of " + num1 + "," + num2 + "," + num3 + " is " + result);
    }

    public static void calculateMean(Scanner input) {
        System.out.print("\nEnter the number of values: ");
        int n = input.nextInt();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            sum += input.nextDouble();
        }

        double mean = sum / n;

        System.out.println("The mean is: " + mean);
    }

    public static void getUserInformation(Scanner input) {
        System.out.println("   \n           User 's Information\n");
        System.out.print("\nEnter your First Name  :");
        String firstName = input.nextLine();

        System.out.print("Enter your Middle Name :");
        String middleName = input.nextLine();

        System.out.print("Enter your Last name   :");
        String lastName = input.nextLine();

        System.out.print("Enter your Age         :");
        String ageInput = input.nextLine();
        String age = extractInteger(ageInput) + " years old";

        System.out.print("Enter your Year Level  :");
        String yearLevelInput = input.nextLine();
        String yearLevel = yearLevelInput;

        System.out.println("\n" + firstName + " " + middleName + " " + lastName + ", " + age + ", " + yearLevel);
    }

    public static int extractInteger(String str) {
        String number = str.replaceAll("[^0-9]", "");
        return number.isEmpty() ? 0 : Integer.parseInt(number);
    }
}
       
//        Scanner input = new Scanner(System.in);
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


//
//         MeanCalculator meanCalculator = new MeanCalculator();
//
//        meanCalculator.inputNumbers();
//        double mean = meanCalculator.calculateMean();
//
//        System.out.println("The mean is: " + mean);
//


//          System.out.println("   \n           User's Information\n");
//        System.out.print("Enter your First Name: ");
//        String firstName = input.nextLine();
//
//        System.out.print("Enter your Middle Name:");
//        String middleName = input.nextLine();
//        
//        System.out.print("Enter your Last name:  ");
//        String lastName = input.nextLine();
//
//        System.out.print("Enter your Age:        ");
//        String ageInput = input.nextLine();
//        String age = extractInteger(ageInput) + " years old"; 
//        
//        System.out.print("Enter your Year Level: ");
//        String yearLevelInput = input.nextLine();
//        String yearLevel = yearLevelInput;  
//         
//       
//        System.out.println("\n" + firstName + " "+ middleName +" " + lastName + ", " + age + ", " + yearLevel);
//        
//        input.close();
//    }
//         public static int extractInteger(String str) {
//        String number = str.replaceAll("[^0-9]", "");
//        return number.isEmpty() ? 0 : Integer.parseInt(number);       
//    }
//}
        
    

  