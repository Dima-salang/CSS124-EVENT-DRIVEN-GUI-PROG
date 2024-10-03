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
public class PutanAct5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your blood type: ");
        String bType = input.nextLine();
        
        switch (bType) {
            case "A":
                System.out.println("You are earnest and creative");
                break;
            case "B":
                System.out.println("You are passionate and has an active nature");
                break;
            case "O":
                System.out.println("You are cool and rational");
                break;
            case "AB":
                System.out.println("Your are confident and self determined");
                break;
            default:
                System.out.println("Enter a valid blood type...");
                break;
        }
        
        
    }
    
}
