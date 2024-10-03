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
public class LuisGabrielle24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = input.nextInt();
        
        if (age < 18){
            System.out.println("You are still a minor.");
        } else if (age  >= 18){
            System.out.println("You are already an adult.");
        } else {
            System.out.println("You are a Senior");
        } 
        input.close();
    }
}
