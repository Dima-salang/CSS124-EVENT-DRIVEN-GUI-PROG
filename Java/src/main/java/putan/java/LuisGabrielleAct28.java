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
public class LuisGabrielleAct28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Input second number: ");
        double num2 = input.nextDouble();
        
        if (num1 == num2) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
        input.close();
    }
}
