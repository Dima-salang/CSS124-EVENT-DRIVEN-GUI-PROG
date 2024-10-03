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
public class PutanAct23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the lower bound: ");
        int lowBound = input.nextInt();
        
        System.out.print("Enter the upper bound: ");
        int upBound = input.nextInt();
        
        while (upBound > lowBound-1){
            System.out.print(upBound + ", ");
            upBound--;
        }
    }
}
