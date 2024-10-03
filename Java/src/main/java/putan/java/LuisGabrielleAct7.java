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
public class LuisGabrielleAct7 {
    public static void main(String[] args){
        
        Scanner answer = new Scanner(System.in);
        
        System.out.println("-----MULTIPLICATION OF TWO NUMBERS PROGRAM-----");
        System.out.print("Input first number: ");
        double firstNum = answer.nextDouble();
        
        System.out.print("Input second number: ");
        double secNum = answer.nextDouble();
        
        System.out.println("Product: " + (firstNum * secNum));
        
        answer.close();
        
        
        
    }
}
