package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.border.*;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class Myframes extends JFrame implements ActionListener {
    JCheckBox j1, j2, j3;
    JRadioButton r1;
    JTextField t1;
    JRadioButton r2;
    JPanel p;

    Myframes() {
        super("Demo1");
        j3 = new JCheckBox("some");
        p = new JPanel();
        r2 = new JRadioButton("UPPER");
        j1 = new JCheckBox("BOLD");
        r1 = new JRadioButton("lower");
        t1 = new JTextField("ADARSH", 30);
        t1.setBounds(10, 20, 100, 80);
        j1.setMnemonic(KeyEvent.VK_B);

        j2 = new JCheckBox("Italic");
        j2.setMnemonic(KeyEvent.VK_I);
        r2.setActionCommand("UPPER");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        r1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);

        j1.addActionListener(this);
        r2.addActionListener(this);
        r1.setActionCommand("Lower");
        p.add(t1);
        p.add(j1);
        p.add(r1);
        p.add(r2);
        p.add(j2);

        // HEre creating border
        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 4), "MINOR PROJECT");
        p.setBorder(br);
        setLayout(new FlowLayout());
        // add(t1);
        // add(r1);
        // add(j2);
        // add(r2);
        // add(j1);
        add(p);
    }

    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "Lower":
                t1.setText(t1.getText().toLowerCase());
                break;
            case "UPPER":
                t1.setText(t1.getText().toUpperCase());
                break;
        }
        int b = 0, i = 0;
        if (j1.isSelected()) {
            b = Font.BOLD;
        }
        if (j2.isSelected()) {
            i = Font.ITALIC;

        }
        Font f = new Font("Times new roman", b | i, 23);
        t1.setFont(f);

    }

}

public class jtexfi {

    public static void main(String[] args) {
        Myframes m = new Myframes();
        m.setSize(500, 400);
        // m.setLayout(null);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
