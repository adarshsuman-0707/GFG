package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.*;
class MyFrame extends JFrame{

    JLabel l;
    JTextField tf;
    JButton b;
     JPanel p;
     MyFrame(){
        super("Border");
        l=new JLabel("Name");
        tf=new JTextField(20);
        b=new JButton("OK");
        p =new JPanel();
        p.add(l);
        p.add(tf);
        p.add(b);
       
// Border br=BorderFactory.createLoweredBevelBorder();
// Border br =BorderFactory.createRaisedBevelBorder();
// Border br =BorderFactory.createBevelBorder(BevelBorder.LOWERED);
// Border br =BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
// Border br =BorderFactory.createTitledBorder("FORM HAI ");
// Border br =BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE,4),"Login");

Border br =BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE,4),"Login",TitledBorder.CENTER,TitledBorder.LEFT);




p.setBorder(br);


        setLayout(new FlowLayout());
        add(p);

     }


}
public class BorderSWin {
public static void main(String[] args) {
    MyFrame f1 =new MyFrame();
    f1.setSize(700,500);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setVisible(true);
 }

    
}
