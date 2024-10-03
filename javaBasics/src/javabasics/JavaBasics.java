/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class JavaBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, Java");
        System.out.println("sdasdasd");


        // arrays
        
        
        // input using BufferedReader, advisable if using mostly with strings
        

        // using the Scanner class
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);

    }
    
}
