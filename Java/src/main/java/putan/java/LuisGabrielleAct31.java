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
public class LuisGabrielleAct31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-----EDUCATIONAL AGE PROGRAM-----");
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        if (age >= 12 && age <= 12){
            System.out.println("Your educational age is Elementary");
        } else if (age >= 13 && age <= 16){
            System.out.println("Your educational age is Junior High");
        } else if (age >= 17 && age <= 18){
            System.out.println("Your educational age is Senior High");
        } else {
            System.out.println("You are College");
        }
    }
}
