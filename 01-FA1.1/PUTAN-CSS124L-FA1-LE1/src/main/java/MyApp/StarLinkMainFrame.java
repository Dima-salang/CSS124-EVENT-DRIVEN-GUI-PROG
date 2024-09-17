/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyApp;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
/**
 *
 * @author luisputan
 */
public class StarLinkMainFrame extends JFrame {
    // variables for the mainframe
    JFrame mainFrame;
    JPanel mainPanel; 

    // variables for the inputPanel
    JPanel inputPanel;

    // variables for the save/update/delete buttons panel
    JPanel buttonPanel;

    JButton saveBtn;
    JButton updateBtn;
    JButton deleteBtn;


    // varibles for the output panel
    JPanel textPanel;
    
    JTextArea textArea;
    JButton clearAllBtn;

    public StarLinkMainFrame() {
        mainFrame = new JFrame("SpaceX Starlink Project");
        mainFrame.setSize(700, 400);
        mainFrame.setVisible(true);
        
        mainFrame.setLayout(new GridLayout(3, 1));
        
        
        // initialize the panel rows
        inputPanel = new JPanel();
        buttonPanel = new JPanel();
        textPanel = new JPanel();
        
        // input panel
        

        // button panel
        // set the layout manager
        buttonPanel.setLayout(new FlowLayout());

        saveBtn = new JButton("Save");
        updateBtn = new JButton("Update");
        deleteBtn = new JButton("Delete");

        buttonPanel.add(saveBtn);
        buttonPanel.add(updateBtn);
        buttonPanel.add(deleteBtn);
        // text panel
        // set the layout manager
        textPanel.setLayout(new GridLayout(2, 1));
        
        textArea = new JTextArea(10, 10);
        clearAllBtn = new JButton("Clear All");

        
        textPanel.add(textArea); 
        textPanel.add(clearAllBtn);

        // adding the panels to the main frame
        mainFrame.add(inputPanel);
        mainFrame.add(buttonPanel);
        mainFrame.add(textPanel);

        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);


        inputPanel.setVisible(true);
        buttonPanel.setVisible(true);
        textPanel.setVisible(true);
    }


    public static void main(String[] args) {
        
        new StarLinkMainFrame();
    }
}
