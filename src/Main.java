

import JFrame.MyFrame;

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

        // End
        frame.setVisible(true);
    }
}