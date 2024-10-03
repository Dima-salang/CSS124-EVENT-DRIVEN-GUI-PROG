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
public class LuisGabrielleAct11 {
    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
        
        System.out.println("-----AGE CLASSIFICATION PROGRAM-----\n");
        System.out.print("Enter your age: ");
        int age = answer.nextInt();
        
        if (age <= 17 && age > 0) {
            System.out.println(" You are a minor");
        } else if (age >= 18 && age <=59){
            System.out.println(" You are an adult");
        } else if (age > 60) {
            System.out.println("You are a senior");
        } else {
            System.out.println("Enter a valid input");
        }
        
        answer.close();
    }
}
