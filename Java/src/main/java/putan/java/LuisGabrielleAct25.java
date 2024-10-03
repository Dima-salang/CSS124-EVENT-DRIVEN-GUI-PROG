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
public class LuisGabrielleAct25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input year: ");
        int year = input.nextInt();
        
        if (year >= 2101) {
            System.out.println("Distant Future");
        } else if (year >= 2001){
            System.out.println("21st Century");
        } else if (year >= 1901){
            System.out.println("20th Century");
        } else {
            System.out.println("Long ago.");
        }
        input.close();
    }
}
