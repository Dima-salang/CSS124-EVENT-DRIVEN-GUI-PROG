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
public class LuisGabrielleAct23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int numInput = input.nextInt();
        
        if (numInput < 0) {
            System.out.println("NEGATIVE");
        } else if (numInput > 0){
            System.out.println("POSITIVE");
        } else {
            System.out.println("NEUTRAL");
        }
        input.close();
    }
}
