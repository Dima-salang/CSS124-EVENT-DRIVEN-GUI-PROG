package putan.java;

import java.util.Scanner;

public class LuisGabrielleAct3 {
    public static void main(String[] args){
        /* Initialize scanner */
        Scanner inputReader = new Scanner(System.in);
        
        /* Prompt user for input */
        System.out.println("Enter your name: ");
        String userName = inputReader.nextLine();
        
        System.out.println("Enter your age: ");
        int userAge = inputReader.nextInt();
        
        System.out.println("Enter your average: ");
        int userAve = inputReader.nextInt();
        
        /* Display outputs */
        System.out.println("Your name is: " + userName);
        System.out.println("Your age is: " + userAge);
        System.out.println("Your average is: " + userAve);
    }
}
