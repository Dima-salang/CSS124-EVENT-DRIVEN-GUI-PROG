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
public class LuisGabrielleAct33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        if (num2 > num1){
            System.out.println("The highest number is: " + num2);
            System.out.println("The lowest number is: " + num1);
        } else if (num1 > num2) {
            System.out.println("The highest number is: " + num1);
            System.out.println("The lowest number is: " + num2);
        } else {
            System.out.println("They are equal");
        }
    }
}
