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
public class PutanAct29 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int counter = 0;
        
        if (num % 2 == 0){
            num += 3;
            do {
                System.out.println(num);
                counter++;
                num += 3;
            } while (counter < 5);
        } else {
            num += 4;
            do {
                System.out.println(num);
                counter++;
                num += 4;
            } while (counter < 5);
        }
    }
}
