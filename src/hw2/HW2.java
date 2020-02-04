
package hw2;

import java.util.Scanner;

public class HW2 {
    /**
     * Compute an amount of financial aid provided to a family,
     * based on the specification in the assignment
     * 
     * @param income The income of a family, in dollars
     * @param numKids The number of children in a family
     * @return The assistance provided to the family, in dollars
     */
    public static double computeAssistance(double income, int numKids) {
        double assistance = 0.0;
        // TODO: Compute the assistance based on the income
        // and the number of kids
        return assistance;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the family income: $");
        double income = in.nextDouble();
        int numKids = 0;
        // TODO: Ask for the number of kids as an input
        // Right now it's just the dummy value zero
        
        double assistance = computeAssistance(income, numKids);
        System.out.println("The amount of assistance is $" + assistance);
    }
    
}
