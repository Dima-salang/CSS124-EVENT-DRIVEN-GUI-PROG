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
public class PutanAct6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many children do you have?: ");
        
        String childNum = input.nextLine();
        int taxExempt = 0;
        
        switch (childNum){
            case "0":
                taxExempt = 3000;
                break;
            case "1":
                taxExempt = 3500;
                break;
            case "2":
                taxExempt = 4000;
                break;
            case "3":
                taxExempt = 4500;
                break;
            case "4":
                taxExempt = 5000;
                break;
            default:
                System.out.println("Enter a valid input...");
                break;
        }
        
        System.out.println("Your tax exemption is: " + taxExempt);
    }
}
