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
public class WhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 3;
        String password = "123";
        String attemptPass;
        
        System.out.print("Enter the password. You have three attempts: ");
        while (counter != 0){
            
            attemptPass = input.nextLine();
            if (attemptPass.equals("123")){
                System.out.println("Access granted.");
               
            }
            else {
                System.out.println("Try again.");
                
                counter--;
                System.out.println("You have " + counter + " attempts left.");
                System.out.print("Enter another password: ");

            }
            
        System.out.println("You failed");
            
        }
    }
}
