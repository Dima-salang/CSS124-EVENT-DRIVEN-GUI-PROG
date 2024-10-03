/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.awt.*;
/**
 * 
* @author Luis
 */
public class SongSelection extends JFrame {

    JPanel mainPanel;
    JPanel songSelectionPanel;
    JScrollPane songLyricsPanel;
    JPanel songComboBoxPanel;
    JPanel fontSizeEditorPanel;
    JPanel fontStyleEditorPanel;
    JPanel fontEditorPanel;

    JComboBox<String> songComboBox;
    JLabel songSelectLabel;
    JLabel songTitleLabel;
    JTextArea lyricsTextArea;

    String lyrics;
    int fontSize = 14;
    int fontStyle = Font.PLAIN;
    JRadioButton smallButton;
    JRadioButton mediumButton;
    JRadioButton largeButton;

    JCheckBox normalCheckBox;
    JCheckBox boldCheckBox;
    JCheckBox italicCheckBox;

    
    public SongSelection() {
        
        setTitle("Song Selection Program");
        setSize(1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2, 15, 15));
        ImageIcon songSelectImg = new ImageIcon("src/MyApp/music_select_icon.png");
        setIconImage(songSelectImg.getImage());

        
        

        // song selection
        songComboBoxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel songSelectLabel = new JLabel();
        songSelectLabel.setIcon(new ImageIcon(songSelectImg.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH)));
        songComboBoxPanel.add(songSelectLabel);

        songTitleLabel = new JLabel("Song Selection Program");
        songTitleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        songTitleLabel.setForeground(Color.BLUE);
        songComboBoxPanel.add(songTitleLabel);

        songComboBox = new JComboBox<>(new DefaultComboBoxModel<>(new String[]{"Daylight - Harry Styles", "Ikot - Over October", "Pagtingin - Ben and Ben", "We Could Happen - AJ Rafael"}));
        songComboBox.setPrototypeDisplayValue("XXXXXXXXXXXXXXXXXXXXXXxxxxxxxxxxxxxxxxxxxxxxxxxx");
        songComboBox.setSelectedIndex(-1);
        songComboBoxPanel.add(songComboBox);

        songComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                songComboboxItemStateChanged(evt);
            }
        });

        // font size radio buttons
        fontSizeEditorPanel = new JPanel();
        fontSizeEditorPanel.setBorder(BorderFactory.createTitledBorder("Font Size"));
        fontSizeEditorPanel.setLayout(new GridLayout(3, 1));

        // button group for fontsize
        ButtonGroup fontSizeGroup = new ButtonGroup();
        smallButton = new JRadioButton("Small");
        smallButton.setFont(new Font("Arial", Font.PLAIN, 14));
        mediumButton = new JRadioButton("Medium");
        mediumButton.setFont(new Font("Arial", Font.PLAIN, 14));
        largeButton = new JRadioButton("Large");
        largeButton.setFont(new Font("Arial", Font.PLAIN, 14));

        smallButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadioButtonItemStateChanged(evt);
            }
        });

        mediumButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadioButtonItemStateChanged(evt);
            }
        });

        largeButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadioButtonItemStateChanged(evt);
            }
        });

        fontSizeGroup.add(smallButton);
        fontSizeGroup.add(mediumButton);
        fontSizeGroup.add(largeButton);

        fontSizeEditorPanel.add(smallButton);
        fontSizeEditorPanel.add(mediumButton);
        fontSizeEditorPanel.add(largeButton);

        // font style checkboxes
        fontStyleEditorPanel = new JPanel();
        fontStyleEditorPanel.setBorder(BorderFactory.createTitledBorder("Font Style"));
        fontStyleEditorPanel.setLayout(new GridLayout(3, 1));

        normalCheckBox = new JCheckBox("Normal");
        normalCheckBox.setFont(new Font("Arial", Font.PLAIN, 14));
        boldCheckBox = new JCheckBox("Bold");
        boldCheckBox.setFont(new Font("Arial", Font.PLAIN, 14));
        italicCheckBox = new JCheckBox("Italic");
        italicCheckBox.setFont(new Font("Arial", Font.PLAIN, 14));

        normalCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CheckBoxesItemStateChanged(evt);
            }
        });

        boldCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CheckBoxesItemStateChanged(evt);
            }
        });

        italicCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CheckBoxesItemStateChanged(evt);
            }
        });

        fontStyleEditorPanel.add(normalCheckBox);
        fontStyleEditorPanel.add(boldCheckBox);
        fontStyleEditorPanel.add(italicCheckBox);

        // font editor panel
        fontEditorPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        fontEditorPanel.add(fontSizeEditorPanel);
        fontEditorPanel.add(fontStyleEditorPanel);
        
        // main panel
        mainPanel = new JPanel(new GridLayout(1, 2));
        Border border = BorderFactory.createEmptyBorder(20, 20, 20, 20);
        mainPanel.setBorder(border);

        // song selection panel
        songSelectionPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        songSelectionPanel.add(songComboBoxPanel);
        songSelectionPanel.add(fontEditorPanel);

        // song lyrics
        lyricsTextArea = new JTextArea(40, 40);
        songLyricsPanel = new JScrollPane(lyricsTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        
        mainPanel.add(songSelectionPanel);
        mainPanel.add(songLyricsPanel);

        add(mainPanel);

        setVisible(true);
        
    }

    private void songComboboxItemStateChanged(java.awt.event.ItemEvent evt) {
        
        String song = songComboBox.getSelectedItem().toString();
        try {
            File file = new File("src/MyApp/" + song + ".txt");
            Scanner reader = new Scanner(file);

            // reset the lyrics
            lyrics = "";

            while (reader.hasNextLine()) {
                lyrics += reader.nextLine() + "\n";
            }
            lyricsTextArea.setText(lyrics);

            reader.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private void RadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {
        if (evt.getSource() == smallButton) {
            if (evt.getStateChange() == 1) {
                fontSize = 12;
            }
            
        } else if (evt.getSource() == mediumButton) {
            if (evt.getStateChange() == 1) {
                fontSize = 16;
            }
            
        } else if (evt.getSource() == largeButton) {
            if (evt.getStateChange() == 1) {
                fontSize = 19;
            }
        }
        lyricsTextArea.setFont(new Font("Arial", fontStyle, fontSize));
    }

    private void CheckBoxesItemStateChanged(java.awt.event.ItemEvent evt) {
        fontStyle = Font.PLAIN;
        if (evt.getSource() == normalCheckBox) {
            
            if (evt.getStateChange() == 1) {
                fontStyle = Font.PLAIN;
                // reset the bold and italic check boxes
                boldCheckBox.setSelected(false);
                italicCheckBox.setSelected(false);
                
            }
            
        }
        
        // check if the bold and italic checkboxes are selected
        if (boldCheckBox.isSelected()) {
            normalCheckBox.setSelected(false);
            fontStyle |= Font.BOLD;
        }

        if (italicCheckBox.isSelected()) {  
            normalCheckBox.setSelected(false);          
            fontStyle |= Font.ITALIC;
        }
        

        lyricsTextArea.setFont(new Font("Arial", fontStyle, fontSize));
    }

    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SongSelection();
            }
        });
    }
}
