/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java4thQuarter;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class PutanAct4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your gender (M / F ): ");
        char gender = input.next().charAt(0);
        
        switch (gender) {
            case 'M':
                System.out.println("You are a Male!");
                break;
            case 'F':
                System.out.println("You are a Female");
                break;
            default:
                System.out.println("Enter a valid gender...");
                break;
        }
    }
}
