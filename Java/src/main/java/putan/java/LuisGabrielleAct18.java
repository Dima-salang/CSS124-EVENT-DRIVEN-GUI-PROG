/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package putan.java;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class LuisGabrielleAct18 {
    public static void main(String[] args){
        Scanner grade = new Scanner(System.in);
        
        System.out.print("Enter your first grade: ");
        double grade1 = grade.nextDouble();
        
        System.out.print("Enter your second grade: ");
        double grade2 = grade.nextDouble();
        
        System.out.print("Enter your third grade: ");
        double grade3 = grade.nextDouble();
        
        double genAve = (grade1 + grade2 + grade3) / 3;
        
        if (genAve >= 97) {
            System.out.println("Equivalent Grade: 1.0, Remarks: Excellent");
        } else if (genAve <= 96 && genAve >= 94){
            System.out.println("Equivalent Grade: 1.25, Remarks: Excellent");
        } else if (genAve <= 93 && genAve >= 91) {
            System.out.println("Equivalent Grade: 1.5, Remarks: Very Good");
        } else if (genAve <= 90 && genAve >= 88){
            System.out.println("Equivalent Grade: 1.75, Remarks: Very Good");
        } else if (genAve <= 87 && genAve >= 85) {
            System.out.println("Equivalent Grade: 2.0, Remarks: Good");
        } else if (genAve <= 84 && genAve >= 82) {
            System.out.println("Equivalent Grade: 2.5, Remarks: Good");
        } else if (genAve <= 81 && genAve >= 79) {
            System.out.println("Equivalent Grade: 2.25, Remakrs: Satisfactory");
        } else if (genAve <= 76 && genAve >= 78) {
            System.out.println("Equivalent Grade: 2.75, Remarks: Fair");
        } else if (genAve == 75) {
            System.out.println("Equivalent Grade: 3.0, Remarks: Passed");
        } else {
            System.out.println("Equivalent Grade: 5.0, Remarks: Failed");
        }
                
         
    }
}
