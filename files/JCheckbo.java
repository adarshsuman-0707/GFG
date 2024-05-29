package files;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Myframe extends JFrame implements ActionListener{
JCheckBox c1,c2;
JRadioButton r1,r2;
JTextField tf;
Myframe(){
    super("Demo");

tf= new JTextField("Demo text",20);
tf.setBounds(10,20,100,80);
c1=new JCheckBox("Bold");
c1.setMnemonic(KeyEvent.VK_B);
c2=new JCheckBox("Italic");
c2.setMnemonic(KeyEvent.VK_I);
r1=new JRadioButton("Lower");
r2=new JRadioButton("UPPER");
ButtonGroup bd= new ButtonGroup();
bd.add(r1);
bd.add(r2);
r1.addActionListener(this);
c1.addActionListener(this);
r2.addActionListener(this);
c2.addActionListener(this);
r1.setActionCommand("Lower");
r2.setActionCommand("UPPER");
setLayout(new FlowLayout());
add(tf);
add(c1);
add(c2);
add(r1);
add(r2);


}
public void actionPerformed(ActionEvent ae){
    switch (ae.getActionCommand()) {
        case "Lower": tf.setText(tf.getText().toLowerCase());
            break;
    case "UPPER" : tf.setText(tf.getText().toUpperCase());
   break;
    }
    int b=0,i=0;
    if(c1.isSelected()) {b=Font.BOLD;}

    if(c2.isSelected()) {i=Font.ITALIC;}

    Font f= new Font("Times New Roman",b|i,15);
tf.setFont(f);
}
}
public class JCheckbo {
    public static void main(String[] args) {
     Myframe f = new Myframe();
     f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
