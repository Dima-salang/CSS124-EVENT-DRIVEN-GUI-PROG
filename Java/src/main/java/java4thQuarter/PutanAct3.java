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
public class PutanAct3 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("-----CALCULATOR PROGRAM-----");
       System.out.print("Enter first number: ");
       double num1 = input.nextDouble();
       
       System.out.print("Enter second number: ");
       double num2 = input.nextDouble();
       
       input.nextLine();
       
       double result = 0;
       
       System.out.print("Enter the operation: ");
       String operation = input.nextLine();
       
       switch (operation) {
           case "+":
              result = num1 + num2;
              break;
           case "-":
               result = num1 - num2;
               break;
           case "*":
               result = num1 * num2;
               break;
           case "/":
               result = num1 / num2;
               break;
           default:
               System.out.println("Please enter a valid operation...");
               break;
       }
       
       System.out.println("The result is: " + result);
       
    }
}
