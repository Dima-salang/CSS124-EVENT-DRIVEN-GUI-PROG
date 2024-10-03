/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java4thQuarter;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Luis
 */
public class PutanAct10 {
    public static float computeInterestRate(float principalAmount, float rate, float time) {
        float solveInterest = (principalAmount * rate * time) / 100;
        return(solveInterest);
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        char contAnswer;
        
        do {
            System.out.println("");
            System.out.println("-----SIMPLE INTEREST SOLVER-----\n");
            System.out.print("Enter principal amount: ");
            float amount = input.nextFloat();
            
            System.out.print("Enter number of years to be paid: ");
            float years = input.nextFloat();
            
            System.out.print("Enter annual rate: ");
            float annualRate = input.nextFloat();
            
            float calculatedAmount = computeInterestRate(amount, annualRate, years);
            
            System.out.println("The total amount of interest is: PHP" + df.format(calculatedAmount));
            System.out.println("");
            
            System.out.print("Do you want to continue? (Y/N) => ");
            contAnswer = input.next().charAt(0);
               
        }
        while (contAnswer == 'Y' || contAnswer == 'y');
            System.out.println("\n-----TERMINATION-----\n");
           
    }
}
