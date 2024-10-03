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
public class putanAct25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if (num % 2 == 0){
            System.out.println("The number you entered is even!");
            int counter = 0;
            while (counter < 5){
                if (counter == 4){
                    System.out.print(num);
                    counter++;
                } else {
                    System.out.print(num + ", ");
                    counter++;
                    num += 2;
                }
            }
        } else {
            System.out.println("The number you entered is odd!");
            
            int counter = 0;
            while (counter < 5){
                if (counter == 4){
                    System.out.print(num);
                } else {
                    System.out.print(num + ", ");
                    counter++;
                    num += 2;
                }
            }
        }
    }
}
