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
public class LuisGabrielleAct9 {
    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
        
        System.out.println("-----TEMPERATURE CONVERSION-----");
        System.out.print("Enter celcius: ");
        
        double celcius = answer.nextDouble();
        
        double fahrenheit = ((celcius * 9)/5)+32;
        
        System.out.println("Fahrenheit equivalent: " + fahrenheit);
        
        answer.close();
    }
}
