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
public class LuisGabrielleAct29 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temp = input.nextDouble();
        String reading;
        
        if (temp < 0){
            reading = "Freezing Water";
        } else if (temp >= 1 && temp <= 10){
            reading = "Very Cold Weather";
        } else if (temp >= 11 && temp <= 20) {
            reading = "Cold Weather";
        } else if (temp >= 21 && temp <= 30) {
            reading = "Normal in Temperature";
        } else if (temp >= 30 && temp <= 40) {
            reading = "Hot";
        } else {
            reading = "Very Hot";
        }
        System.out.println("It's " + reading);
        input.close();
    }
}
