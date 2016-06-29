package DayThree;

import com.sun.javafx.scene.control.skin.LabeledText;

import javax.swing.*;
import java.awt.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

/**
 * Created by student on 29/06/2016.
 */
public class ProjectdayThree {

    JFrame mainFrame;
    JPanel panel;
    JLabel labelText;
    JLabel labelChar;
    JTextArea Character;


    public ProjectdayThree()
    {

        mainFrame = new JFrame("Character Finder");
       // mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600,100);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLocationRelativeTo(null);

        panel = new JPanel();

        panel.setSize(600,100);

        panel = new JPanel();
        panel.add(labelText);

        labelText = 


      //  characterFinder = new Jlabelchar("", 1, 16);



        JLabel labelText.addActionListener( event -> {
          //  result = checkRegularExpression(characterFinder.getText());
           // if (result) JOptionPane.showMessageDialog(null, "number of " +  );
          //  else JOptionPane.showMessageDialog(null, " ");
        } );

        mainFrame.add(panel);
        panel.add(labelText, BorderLayout.WEST);
        panel.add(labelChar, BorderLayout.EAST);

        mainFrame.setVisible(true);


    }
}
