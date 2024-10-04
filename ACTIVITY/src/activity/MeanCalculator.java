/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity;

import java.util.Scanner;

/**
 *
 * @author Asnari Pacalna
 */
class MeanCalculator {
    private static final int NUMBER_OF_INPUTS = 5;
    private double sum;

    public MeanCalculator() {
        this.sum = 0;
    }

    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= NUMBER_OF_INPUTS; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }
    }

    public double calculateMean() {
        return sum / NUMBER_OF_INPUTS;
    }
}

