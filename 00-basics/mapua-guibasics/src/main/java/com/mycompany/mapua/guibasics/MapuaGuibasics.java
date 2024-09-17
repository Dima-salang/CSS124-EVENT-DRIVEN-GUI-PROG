/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mapua.guibasics;
import javax.swing.*;
/**
 *
 * @author root
 */
// extends JFrame as MapuGuibasics will be a JFrame itself
public class MapuaGuibasics extends JFrame {
    // declare the components
    JLabel label1;

    // main frame of the program
    // constructor 
    public MapuaGuibasics() {
        // set the properties of the main frame
        setLayout(null);
        setSize(400, 200);
        setVisible(true);

        // initialize label1
        label1 = new JLabel("Hello there!");
        label1.setSize(50, 20);
        label1.setLocation(50, 100);

        // add label1
        this.add(label1);

    }
    // main function to create an instance of the main frame
    public static void main(String[] args) {
  
        new MapuaGuibasics();
        System.out.println("Hello World!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        
    }
}
