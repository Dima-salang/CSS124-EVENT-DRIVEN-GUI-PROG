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
public class LuisGabrielleAct13 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        
        System.out.println("-----CIVIL STATUS PROGRAM-----");
        
        System.out.print("Enter your name: ");
        String name = answer.nextLine();
        
        System.out.println("""
                           SINGLE - 1
                           MARRIED - 2
                           ANNULLED - 3
                           SEPARATED - 4
                           WINDOWED - 5
                           """);
        System.out.print("Enter your civil status. You can choose from the choices: ");
        int civilStatus = answer.nextInt();
        
        if (civilStatus == 1){
            System.out.println(name + ", You are single.");
        } else if (civilStatus == 2) {
            System.out.println(name + ", You are married.");
        } else if (civilStatus == 3) {
            System.out.println(name + ", You are annulled");
        } else if (civilStatus == 4){
            System.out.println(name + ", You are separated.");
        } else if (civilStatus == 5){
            System.out.println(name + ", You are widowed.");
        } else {
            System.out.println(name + "Enter a valid input");
        }
        
    }
}
