package GUI;

// import java.util.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.*;
import java.awt.*;


public class Learn extends JFrame {
    JLabel l1;
    JLabel l2, l3, l4;
    JButton b1, b2, b3;
    JTextField t1;
    JPasswordField t2;

    Learn(String s) {
        super(s);
    }

    Learn() {

    }
    // void setComponents(){
    // JLabel jl=new JLabel("Welcome in java");

    // setLayout(null);
    // jl.setBounds(250,30,100,60);
    // add(jl);
    // JTextField jt=new JTextField();
    // jt.setBounds(200,70,200,20);
    // add(jt);

    // }

    void setComponents() {
        Cursor c1=new Cursor(Cursor.HAND_CURSOR);
        Cursor c2=new Cursor(Cursor.WAIT_CURSOR);
        Cursor c3=new Cursor(Cursor.HAND_CURSOR);
        Font f1=new Font("Times New Roman",Font.BOLD,28);
        Font f2=new Font("Callibri",Font.BOLD,22);



        l1 = new JLabel("Welcome to Family Restaurant ");
        l1.setFont(f1);
        l1.setForeground(Color.BLUE);
        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        l2.setFont(f2);
        l3.setFont(f2);


        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b2 = new JButton("clear");
        b3 = new JButton("Add");

        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        l1.setBounds(100, 50, 500, 30);
        l2.setBounds(100, 200, 200, 30);
        l3.setBounds(100, 350, 200, 30);
        l4.setBounds(100, 550, 200, 30);
        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);
        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(400, 450, 100, 30);
        b3.setBounds(500, 550, 100, 30);
        b1.setCursor(c1);
        b2.setCursor(c2);
        b3.setCursor(c3);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.WHITE);
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b1.addActionListener(new Log());
        b2.addActionListener(new cle());
        b3.addActionListener(new Add());
     
    }

    public static void main(String[] args) {
        Learn l = new Learn("welcome to new page");
        l.setVisible(true);
        l.setSize(700, 700);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setComponents();

    }

    class Log implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String s1 = t1.getText();
            String s2 = t2.getText();
            if (s1.equals("Coding") && s2.equals("123")) {
                JOptionPane.showMessageDialog(null, "Login succesfully");
                l4.setText("login successfull");
                l4.setForeground(Color.GREEN);
            } else {
                JOptionPane.showMessageDialog(null, "Login unsuccessfull");

                l4.setText("Login unsuccessfull");
                l4.setForeground(Color.BLACK);
            }

        }
    }

    class cle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            t1.setText("");
            t2.setText("");

        }
    }

    class Add implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Agar yha kisi field me text enter kiya number ki jagah to exception asakta
            // hai
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                l4.setText("Addition is " + c);
            } catch (Exception e1) {
                l4.setText("please enter number only");
                l4.setForeground(Color.RED);
            }

        }
    }
}
