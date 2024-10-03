/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java4thQuarter;

/**
 *
 * @author Luis
 */
public class PutanAct31 {
    public static void main(String[] args){
        int num = 1;
        int square = num * num;
        
        do {
            System.out.println(num + "|" + square);
            num++;
            square = num*num;
            
        } while (num < 11);
    }
}
