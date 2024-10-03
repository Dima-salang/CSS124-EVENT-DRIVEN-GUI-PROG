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
public class PutanAct27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Upper Bound Number: ");
        int upBound = input.nextInt();
        int counter = 0;
    
        do {
            if (counter == 2){
                System.out.print(upBound + ", ");
                upBound += 1;
                counter++;
            } else {
                System.out.print(upBound + ", ");
                counter++;
                upBound += 3;
            }
            
        } while (counter <= 3 );
    }
    
}
