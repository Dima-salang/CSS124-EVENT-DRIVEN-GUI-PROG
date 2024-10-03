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
public class PutanAct28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the lower bound: ");
        int lowBound = input.nextInt();
        int counter = 0;
        
        do {
            if (counter == 4){
                System.out.print(lowBound);
                counter++;
            } else {
                System.out.print(lowBound + ", ");
                counter++;
                lowBound++;
            }
            
        } while (counter < 5);
    }
}
