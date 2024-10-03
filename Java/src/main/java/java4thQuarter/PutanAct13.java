/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java4thQuarter;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class PutanAct13 {
    public static double findSum(double num1, double num2, double num3){
        double sum = num1 + num2 + num3;
        return sum;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char reply;
    do {
        System.out.println("=====SUM OF THREE NUMBERS=====");
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();
        
        System.out.println("The result is: " + findSum(num1, num2, num3));
        
        System.out.print("\n\nDo you wan to continue? (Y/N) => ");
        reply = input.next().charAt(0);
    } while (reply == 'Y' || reply == 'y');
    System.out.println("-----TERMINATION-----");
    
}
}
