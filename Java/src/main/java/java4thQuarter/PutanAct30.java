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
public class PutanAct30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char contReply;
        
        do {
            System.out.print("Enter your choice [1, 2, 3]: ");
            char answer = input.next().charAt(0);
            
            switch (answer) {
                case '1':
                    System.out.print("Good!");
                    break;
                case '2':
                    System.out.print("Very Good!");
                    break;
                case '3':
                    System.out.print("Excellent!");
                    break;
                default:
                    System.out.print("Enter a valid input!");
                    break;
            }
            
            System.out.print("\nContinue? (Y/N): ");
            contReply = input.next().charAt(0);
     
        } while (contReply == 'Y' || contReply == 'y');
            System.out.println("-----TERMINATION-----");
        
    }
}
