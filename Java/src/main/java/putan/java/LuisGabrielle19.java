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
public class LuisGabrielle19 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        
        System.out.print("Enter the number of the day: ");
        int dayNum = answer.nextInt();
        
        if (dayNum == 1){
            System.out.println("The day is Monday");
        } else if (dayNum == 2){
            System.out.println("The day is Tuesday");
        } else if (dayNum == 3) {
            System.out.println("The day is Wednesday");
        } else if (dayNum == 4) {
            System.out.println("The day is Thursday");
        } else if (dayNum == 5) {
            System.out.println("The day is Friday");
        } else if (dayNum == 6) {
            System.out.println("The day is Saturday");
        } else if (dayNum == 7) {
            System.out.println("The days is Sunday");
        } else {
            System.out.println("Enter a valid input");
        }
    }
}
