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
public class LuisGabrielleAct10 {
    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
    
        System.out.println("-----DIVISION PROGRAM-----");
        
        System.out.println("Enter the dividend: ");
        double dividend = answer.nextDouble();
        
        System.out.println("Enter the divisor: ");
        double divisor = answer.nextDouble();
        
        System.out.println("The quotient is: " + (dividend / divisor));
        System.out.println("The remainder is: " + (dividend % divisor));
        
        answer.close();
        
    }
    
}
