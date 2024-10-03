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
public class PutanAct11 {
    public static int swapNumbers(int num1, int num2){
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("\n=====SWAPPED ARRANGEMENT=====");
        System.out.println("First Value: " + num1);
        System.out.println("Second Value: " + num2);
        
        return 0;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char reply;
        
        do {
            System.out.println("=====SWAP TWO VALUES=====");
            System.out.print("Enter first value: ");
            int firstVal = input.nextInt();
            
            System.out.print("Enter second value: ");
            int secondVal = input.nextInt();
            
            System.out.println("\n=====ORIGINAL ARRANGEMENT=====");
            System.out.println("First Value: " + firstVal);
            System.out.println("Second Value: " + secondVal);
            
            swapNumbers(firstVal, secondVal);
            
            System.out.print("\nDo you want to do continue? (Y/N) => ");
            reply = input.next().charAt(0);
            
        } while (reply == 'Y' || reply == 'y');
        System.out.println("\n-----TERMINATION-----\n");
    }
}
