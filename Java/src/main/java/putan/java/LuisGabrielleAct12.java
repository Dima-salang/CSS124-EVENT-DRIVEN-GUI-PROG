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
public class LuisGabrielleAct12 {
    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
        
        System.out.println("-----DEPARTMENT NUMBER PROGRAM-----");
        
        System.out.print("Enter department number: ");
        int depNum = answer.nextInt();
        
        if (depNum <= 3){
            System.out.println("Your supervisor is Mr.X");
        } else if (depNum >= 4 && depNum <=7){
            System.out.println("Your supervisor is Mr.Y");
        } else if (depNum >= 8 && depNum <= 9){
            System.out.println("Your supervisor is Mr.Z");
        } else {
            System.out.println("Enter a valid input");
        }
        
    }
}
