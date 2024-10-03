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
public class LuisGabrielleAct27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter day number: ");
        int dayNum = input.nextInt();
        
        String day;
        
        if (dayNum == 1){
            day = "Monday";
        } else if (dayNum == 2){
            day = "Tuesday";
        } else if (dayNum == 3) {
            day = "Wednesday";
        } else if (dayNum == 4) {
            day = "Thursday";
        } else if (dayNum == 5) {
            day = "Friday"; 
        } else if (dayNum == 6) {
            day = "Saturday";
        } else {
            day = "Sunday";
        }
        System.out.println(day);
        input.close();
    }
}
