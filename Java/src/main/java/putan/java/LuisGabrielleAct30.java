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
public class LuisGabrielleAct30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        System.out.println("-----AVERAGE GRADE PROGRAM-----");
        
        System.out.print("Enter your grade in English: ");
        double engGrade = input.nextDouble();
        
        System.out.print("Enter your grade in Math: ");
        double mathGrade = input.nextDouble();
        
        System.out.print("Enter your grade in Science: ");
        double sciGrade = input.nextDouble();
        
        System.out.print("Enter your grade in Computer: ");
        double compGrade = input.nextDouble();
        
        double aveGrade = (engGrade + mathGrade + sciGrade + compGrade) / 4;
        System.out.println("Your average grade is: " + aveGrade);
    }
    
    
    
}
