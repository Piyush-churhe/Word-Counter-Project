
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class word_counter extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton countButton;
    private JLabel resultLabel;


    public word_counter() {
        setTitle("Word Counter");

        textArea = new JTextArea(10, 30);
        countButton = new JButton("Count Words");
        resultLabel = new JLabel("Word Count: 0");

        
        countButton.addActionListener(this);

      
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JScrollPane(textArea));
        add(countButton);
        add(resultLabel);

       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

   
    private int countWords(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

  
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();

        int wordCount = countWords(text);
        resultLabel.setText("Word Count: " + wordCount);
    }

    public static void main(String[] args) {
        new word_counter();
    }
}
