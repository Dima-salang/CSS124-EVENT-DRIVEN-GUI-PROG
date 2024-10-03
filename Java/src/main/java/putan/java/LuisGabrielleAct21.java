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
public class LuisGabrielleAct21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature:");
        int temp = input.nextInt();
        
        if (temp < 0){
            System.out.println("ICE");
        } else if (temp > 0 && temp < 100){
            System.out.println("WATER");
        } else {
            System.out.println("STEAM");
        }
        input.close();
    }
}
