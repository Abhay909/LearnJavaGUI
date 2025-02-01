package JavaLabelsAndSetUp.JFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        MyFrame frame = new MyFrame();//
        JLabel label = new JLabel("Hello World");
        frame.add(label);

        ImageIcon image = new ImageIcon("src/resources/image.jpeg"); // Creates an icon
        frame.setIconImage(image.getImage()); // Change icon of this

        label.setIcon(image);
        label.setText("GoodBye!");//

        label.setHorizontalTextPosition(JLabel.CENTER); // Text alignment
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(255, 255, 255)); // Color

        System.out.println(label.getText());

        // Vertical Alignment
        label.setVerticalAlignment(SwingConstants.CENTER);

        // Horizontal alignment
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //font
        label.setFont(new Font("Impact", Font.BOLD, 72));


        // label.setVisible(false); Label visibility

        // Using HTML in our code
        String html = "<html>" +
                "<ul>" +
                "<li>List #1</li>" +
                "<li>List #1</li>" +
                "<li>List #1</li>" +
                "<li>List #1</li>" +
                "</ul>" +
                "</html>";

        label.setText(html);


        // End
        frame.getContentPane().setBackground(new Color(144, 237, 136));
        frame.setVisible(true);
    }
}