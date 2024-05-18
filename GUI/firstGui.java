package GUI;
import javax.swing.*;

public class firstGui {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        JButton k = new JButton("Click");
        k.setBounds(200,200,200,100);
        j.setVisible(true);
        j.setSize(400,400);
        j.add(k);
        j.setLayout(null);
    }
}
