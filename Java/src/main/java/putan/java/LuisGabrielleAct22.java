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
public class LuisGabrielleAct22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter character: ");
        char charInput = input.next().charAt(0);
        
        if (charInput == 'm'){
            System.out.println("Hello, Sir");
        } else {
            System.out.println("Hello, Madame");
        }
        input.close();
    }
}
