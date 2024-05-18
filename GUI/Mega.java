package GUI;
import javax.swing.*;
import java.awt.*;
class MYframe extends JFrame{
JLabel l;
JButton b;
int count=0;
MYframe(){
    super("Swing done");
    setLayout(new FlowLayout());
    l=new JLabel("clicked"+ count +" TImes");
    b=new JButton("click");
    add(l);
    add(b);

}
}
public class Mega {
    public static void main(String[] args) {
        
    
    MYframe m =new MYframe();
    m.setSize(500,500);
    m.setVisible(true);
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
