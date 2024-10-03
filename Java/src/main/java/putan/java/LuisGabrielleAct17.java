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
public class LuisGabrielleAct17 {
    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        
        String character = answer.nextLine();
        String charUp = character.toUpperCase();
        if (charUp.equals("A") || charUp.equals("E") || charUp.equals("I") 
            || charUp.equals("O") || charUp.equals("U")){
            System.out.println("Your letter is a vowel.");
        } else {
            System.out.println("Your letter is a consonant.");
        }
    }
}
