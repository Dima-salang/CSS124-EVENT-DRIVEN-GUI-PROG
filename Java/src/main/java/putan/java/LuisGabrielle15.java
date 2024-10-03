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
public class LuisGabrielle15 {
    
    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int num = answer.nextInt();
        
        if (num >= 0) {
            System.out.println("Your number is positive");
        } else {
            System.out.println("Your number is negative");
        }
    }
   
}
