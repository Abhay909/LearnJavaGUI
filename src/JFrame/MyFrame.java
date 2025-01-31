package JFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {

        

        // You can either put a in front of everything or call a JFrame super class
        super("Java GUI");

        setSize(500, 500); // Sets size
        setVisible(true); // sets the frane visable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Make sure this closes on x button
        setTitle("Welcome to Java GUI"); // Title of a window
         // setResizable(false); // Prevent this from being resizable

        getContentPane().setBackground(new Color(133, 212, 219)); // Change color of background
        setLocationRelativeTo(null);
        // frame.setLocation(200, 200);

        //JButton button = new JButton("Click me!"); // Create Frame
        // add(button);

        repaint(); // Refresh the window so the button can be displayed
        revalidate();


    }

}
