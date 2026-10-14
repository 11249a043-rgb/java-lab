
import java.awt.*;
import javax.swing.*;
public class Palette extends JFrame {
    Palette() {
        setTitle("Color Palette");
        setSize(400, 200);
        setLayout(new FlowLayout());
        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        JButton blue = new JButton("Blue");
        red.setBackground(Color.RED);
        green.setBackground(Color.GREEN);
        blue.setBackground(Color.BLUE);
        add(red);
        add(green);
        add(blue);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Palette();
    }
}
