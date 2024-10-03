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
public class LuisGabrielleAct26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your height in Meters: ");
        double height = input.nextDouble();
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        
        double bmi = (height * height) / (weight * weight);
        String classification;
        
        if (bmi < 18.5){
            classification = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9){
            classification = "Normal weight";
        } else if (bmi >= 25 && bmi <= 29.9){
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
        System.out.println("You are " + classification);
        input.close();
    }
}
