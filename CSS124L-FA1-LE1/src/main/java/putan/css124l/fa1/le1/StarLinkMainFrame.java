/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package putan.css124l.fa1.le1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Luis
 */
public class StarLinkMainFrame extends JFrame  {
    // variables for the mainframe
    JFrame mainFrame;
    JPanel mainPanel; 

    // variables for the inputPanel
    JPanel inputPanel;
    JPanel satIDPanel;
    JPanel satNamePanel;
    JPanel longLatPanel;
    JPanel elevStatPanel;

    // variables for the save/update/delete buttons panel
    JPanel buttonPanel;

    JButton saveBtn;
    JButton updateBtn;
    JButton deleteBtn;


    // varibles for the output panel
    JPanel textPanel;
    
    JTextArea textArea;
    JButton clearAllBtn;


    // variables for the clearAll panel
    JPanel clearAllPanel;


    public StarLinkMainFrame() {
        setTitle("SpaceX Starlink Project");
        setSize(600, 400);
        setLayout(new GridLayout(5, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Initializing the panels
        JPanel inputPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JPanel textPanel = new JPanel(new BorderLayout());
        JPanel clearAllPanel = new JPanel(new FlowLayout());

        // Input panel setup
        // Satellite ID Panel
        JPanel satIDPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 22, 10)); // 10 pixels horizontal and vertical gap
        satIDPanel.add(new JLabel("Satellite ID"));
        satIDPanel.add(new JTextField(15));
        JButton findSatBtn = new JButton("Find Satellite");
        findSatBtn.setPreferredSize(new Dimension(250, 30));
        
        satIDPanel.add(findSatBtn);
        inputPanel.add(satIDPanel);
        
        // Satellite Name Panel
        JPanel satNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        satNamePanel.add(new JLabel("Satellite Name"));
        satNamePanel.add(new JTextField(40));
        inputPanel.add(satNamePanel);

        // Longitude and Latitude Panel
        JPanel longLatPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 24, 10));
        longLatPanel.add(new JLabel("Longitude"));
        longLatPanel.add(new JTextField(15));

        JPanel latPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 24, 0));
        latPanel.add(new JLabel("Latitde"));
        latPanel.add(new JTextField(15));
        longLatPanel.add(latPanel);
        inputPanel.add(longLatPanel);

        // Elevation and Health Status Panel
        JPanel elevStatPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 10));
        elevStatPanel.add(new JLabel("Elevation"));
        elevStatPanel.add(new JTextField(15));
        
        elevStatPanel.add(new JLabel("Health Status"));
        elevStatPanel.add(new JComboBox<>());
        inputPanel.add(elevStatPanel);


        saveBtn = new JButton("Save");
        saveBtn.setPreferredSize(new Dimension(175, 30));  // Set the width to 100 and height to 30

        updateBtn = new JButton("Update");
        updateBtn.setPreferredSize(new Dimension(175, 30));

        deleteBtn = new JButton("Delete");
        deleteBtn.setPreferredSize(new Dimension(175, 30));

        // Add buttons to the button panel
        buttonPanel.add(saveBtn);
        buttonPanel.add(updateBtn);
        buttonPanel.add(deleteBtn);

        // Text panel setup
        // Clear All panel setup
        JButton clearAllBtn = new JButton("Clear All");
        clearAllBtn.setPreferredSize(new Dimension(175, 30));
        clearAllPanel.add(clearAllBtn);
        
        

        // Adding panels to the main frame
        add(inputPanel);
        add(buttonPanel);
        add(textPanel);
        add(clearAllPanel);

        // Make the frame visible after all components are added
        setVisible(true);
    }


    public static void main(String[] args) {
        
        new StarLinkMainFrame();
    }
}
