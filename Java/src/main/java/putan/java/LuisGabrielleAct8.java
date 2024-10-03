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
public class LuisGabrielleAct8 {
    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
        
        System.out.println("-----COMPUTE RADIUS PROGRAM-----");
        System.out.print("Enter the radius of the circle: ");
        double radius = answer.nextDouble();
        
        double area = ((radius * radius) * 3.14);
        System.out.println("The area of the circle is: " + area);
        
       answer.close();
    }
}
