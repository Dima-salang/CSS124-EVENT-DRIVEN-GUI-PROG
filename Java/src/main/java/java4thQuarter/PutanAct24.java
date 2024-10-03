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
public class PutanAct24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if (num % 2 == 0){
            System.out.println("The number you entered is even!");
            for (int i=0; i < 5; i++){
                if (i==4){
                    System.out.print(num);
                    
                    
                } else {
                    System.out.print(num + ", ");
                    num += 2;
                }
                
            }
        } else {
            System.out.println("The number you entered is odd!");
            
            for (int i=0; i < 5; i++){
                if (i==4){
                    System.out.print(num);
                 
                } else {
                    System.out.print(num + ", ");
                    num += 2;
                }
                
            }
        }
    }
}
