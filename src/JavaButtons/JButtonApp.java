package JavaButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonApp extends JFrame implements ActionListener {

    private JButton button;

    public JButtonApp() {

        // Inherit all traits of JFrame
        super("Window");

        // Set JFrame
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setLayout(null); // Use null layout for absolute positioning

        // Create button
        button = new JButton("button");
        button.addActionListener(this);

        // Set button size and position
        button.setBounds(200, 200, 200, 200); // x, y, width, height
        add(button); // Add button to JFrame

        // Text of button
        button.setText("Easy");

        // Image of Button
        ImageIcon buttonIcon = new ImageIcon("src/resources/red-button.png");
        button.setIcon(buttonIcon);

        // Image when button is pressed
        ImageIcon explosionIcon = new ImageIcon("src/resources/explosion.png");
        button.setPressedIcon(explosionIcon);

        // Set Image when Hovered Over
        button.setRolloverIcon(new ImageIcon("src/resources/earth.png"));

        button.setHorizontalTextPosition(JLabel.CENTER);

        button.setForeground(new Color(255, 255, 255));

        button.setBackground(Color.BLACK);

        button.setOpaque(true); 
        button.setBorderPainted(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // get source
        if (e.getSource() == button) {
            System.out.println("getSource(): I pressed a button");
        }

        // get action command
        if (e.getActionCommand().equals("Easy")) {
            System.out.println("getActionCommand(): I pressed a button");
        }
    }

    
}