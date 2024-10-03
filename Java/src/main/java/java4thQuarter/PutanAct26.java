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
public class PutanAct26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Lower Bound Number: ");
        int lowBound = input.nextInt();
        
        System.out.print("Enter Upper Bound Number: ");
        int upBound = input.nextInt();
        
        do {
            System.out.print(upBound + ", ");
            upBound--;
        } while (upBound >= lowBound);
    }
}
