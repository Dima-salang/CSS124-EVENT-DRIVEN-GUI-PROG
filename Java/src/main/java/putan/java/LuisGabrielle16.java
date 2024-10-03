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
public class LuisGabrielle16 {
    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
        
        System.out.print("Enter the secret words: ");
        String secretWords = answer.nextLine();
        if (secretWords.equals("143")){
            System.out.println("I love you!");
        } else {
            System.out.println("Wrong Guess!!!!");
        }
    }
}
