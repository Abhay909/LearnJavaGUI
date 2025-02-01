package JavaButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class JButtonApp extends JFrame implements ActionListener{

    private JButton button, button2;

    public JButtonApp() {

        // Inherit all traits of JFrame
        super("Window");
        

        // Set JFrame
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);

        // Create button
        button = new JButton("button");
        button.addActionListener(this);
        add(button); // Layout of button

        // Text of button
        // Make sure to change getActionCommand() to the name of this text
        button.setText("Easy");

        // Image of Button
        ImageIcon buttonIcon = new ImageIcon("src/resources/red-button.png");
        button.setIcon(buttonIcon);

        // image when button is pressed
        ImageIcon explosionIcon = new ImageIcon("src/resources/explosion.png");
        button.setPressedIcon(explosionIcon);

        // Set Image when Hovered Over
        button.setRolloverIcon(new ImageIcon("src/resources/earth.png"));

        button.setHorizontalTextPosition(JLabel.CENTER);
        // button.setVerticalTextPosition(JLabel.TOP);

        button.setForeground(new Color(255, 255, 255));

        button.setBackground(Color.BLACK);

        button.setOpaque(true);
        button.setBorderPainted(false);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // get source
        if(e.getSource() == button){
            System.out.println("getSource(): I pressed a button");
        }

        // get action command
        if(e.getActionCommand().equals("Easy")){
            System.out.println("getActionCommand(): I pressed a button");
        }
    }
}















