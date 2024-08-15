/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class word_counter extends JFrame implements ActionListener {
    // Declare components
    private JTextArea textArea;
    private JButton countButton;
    private JLabel resultLabel;

    // Constructor to set up the GUI
    public word_counter() {
        // Set the title of the window
        setTitle("Word Counter");

        // Initialize components
        textArea = new JTextArea(10, 30);
        countButton = new JButton("Count Words");
        resultLabel = new JLabel("Word Count: 0");

        // Add action listener to the button
        countButton.addActionListener(this);

        // Set up the layout and add components
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JScrollPane(textArea));
        add(countButton);
        add(resultLabel);

        // Set the default close operation and window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    // Method to count words
    private int countWords(String text) {
        // Split the text by spaces and count the resulting parts
        if (text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    // Action performed when button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the text from the text area
        String text = textArea.getText();

        // Count the words and update the result label
        int wordCount = countWords(text);
        resultLabel.setText("Word Count: " + wordCount);
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create an instance of the WordCounter class
        new word_counter();
    }
}
