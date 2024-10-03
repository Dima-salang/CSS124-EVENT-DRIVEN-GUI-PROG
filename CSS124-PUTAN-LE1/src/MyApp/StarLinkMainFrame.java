/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Luis
 */
public class StarLinkMainFrame extends JFrame {


    public StarLinkMainFrame() {
        // main frame configuration
        this.setTitle("SpaceX Starlink Project");
        this.setSize(600, 450);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon mainFrameIcon = new ImageIcon("src/MyApp/Starlink_Logo.png");
        this.setIconImage(mainFrameIcon.getImage());


        // Initializing the panels
        JPanel inputPanel = new JPanel(new GridLayout(5, 1, 10, 3));
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JPanel textPanel = new JPanel(new BorderLayout());
        JPanel clearAllPanel = new JPanel(new FlowLayout());

        // Input panel setup
        // Satellite ID Panel
        JPanel satIDPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 22, 0 ));
        JLabel satIDLabel = new JLabel("Satellite ID");
        satIDLabel.setForeground(Color.BLUE);

        satIDPanel.add(satIDLabel);
        satIDPanel.add(new JTextField(15));
        JButton findSatBtn = new JButton("Find Satellite");
        findSatBtn.setPreferredSize(new Dimension(250, 20));
        
        satIDPanel.add(findSatBtn);
        inputPanel.add(satIDPanel);
        
        // Satellite Name Panel
        JPanel satNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        JLabel satNameLabel = new JLabel("Satellite Name");
        satNameLabel.setForeground(Color.BLUE);

        satNamePanel.add(satNameLabel);
        satNamePanel.add(new JTextField(40));
        inputPanel.add(satNamePanel);

        // Longitude and Latitude Panel
        JPanel longLatPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 23, 0));
        JLabel longitudeLabel = new JLabel("Longitude");
        longitudeLabel.setForeground(Color.BLUE);
        longLatPanel.add(longitudeLabel);
        
        longLatPanel.add(new JTextField(15));

        JPanel latPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 24, 0));
        JLabel latitudeLabel = new JLabel("Latitude");
        latitudeLabel.setForeground(Color.BLUE);
        latPanel.add(latitudeLabel);

        latPanel.add(new JTextField(14));
        longLatPanel.add(latPanel);
        inputPanel.add(longLatPanel);

        // Elevation and Health Status Panel
        JPanel elevStatPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 0));
        JLabel elevLabel = new JLabel("Elevation");
        elevLabel.setForeground(Color.BLUE);
        elevStatPanel.add(elevLabel);
        elevStatPanel.add(new JTextField(15));

        JPanel healthStatPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 9, 0));
        JLabel healthLabel = new JLabel("Health Status");
        healthLabel.setForeground(Color.BLUE);
        healthStatPanel.add(healthLabel);
        JComboBox<String> healthStatus = new JComboBox<>();
        // widen the combo box
        healthStatus.setPrototypeDisplayValue("XXXXXXXXXXXXXXXX");
        healthStatPanel.add(healthStatus);
        elevStatPanel.add(healthStatPanel);
        inputPanel.add(elevStatPanel);

        // adjust the button sizes of the button panel
        JButton saveBtn = new JButton("Save");
        saveBtn.setPreferredSize(new Dimension(175, 25));  // Set the width to 100 and height to 25

        JButton updateBtn = new JButton("Update");
        updateBtn.setPreferredSize(new Dimension(175, 25));

        JButton deleteBtn = new JButton("Delete");
        deleteBtn.setPreferredSize(new Dimension(175, 25));

        // Add buttons to the button panel
        buttonPanel.add(saveBtn);
        buttonPanel.add(updateBtn);
        buttonPanel.add(deleteBtn);

        // Text panel setup
        JTextArea textArea = new JTextArea(10, 50);
        textArea.setEditable(false);
        textPanel.add(textArea, BorderLayout.CENTER);
        // Clear All panel setup
        JButton clearAllBtn = new JButton("Clear All");
        clearAllBtn.setPreferredSize(new Dimension(175, 30));
        clearAllPanel.add(clearAllBtn);
        
        

        // Adding panels to the main frame
        this.add(inputPanel);
        this.add(buttonPanel);
        this.add(textPanel);
        this.add(clearAllPanel);

        // make the main frame visible
        this.setVisible(true);
    }


    public static void main(String[] args) {
        
        new StarLinkMainFrame();
    }
}
