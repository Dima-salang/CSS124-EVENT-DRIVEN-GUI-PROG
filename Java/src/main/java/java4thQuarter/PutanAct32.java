/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java4thQuarter;

/**
 *
 * @author Luis
 */
public class PutanAct32 {
    public static void main(String[] args){
        int lowBound = 100;
        int upBound = 200;
        System.out.println("Even-----Odd");
        do {
            System.out.println(lowBound + "-----" + (lowBound += 1));
            lowBound++;
        } while (lowBound < 200);
    }
}
