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
public class LuisGabrielleAct14 {
    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
        
        System.out.println("-----CALCULATOR PROGRAM-----");
        
        System.out.print("Enter your first number: ");
        double firstNum = answer.nextDouble();
        
        System.out.print("Enter your second number: ");
        double secondNum = answer.nextDouble();
        
        answer.nextLine();
        
        System.out.println("""
                           OPERATORS:
                           + - ADDITION
                           - - SUBTRACTION
                           * - MULTIPLICATION
                           / - DIVISION
                           """);
        System.out.print("Enter your desired operation: ");
        char operator = answer.next().charAt(0);
        
        if (operator == '+'){
            System.out.println("The sum is: " + (firstNum + secondNum));
        } else if (operator == '-') {
            System.out.println("The difference is: " + (firstNum - secondNum));
        } else if (operator == '*') {
            System.out.println("The product is: " + (firstNum * secondNum));
        } else if (operator == '/') {
            System.out.println("The quotient is: " +(firstNum / secondNum));
        } else {
            System.out.println("Enter a valid operation");
        }
    }
}
