package GUI;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.tree.*;
class MyFrame3 extends JFrame{
    // JTree t;
JPanel p;

    /**
     * 
     */
    MyFrame3(){
        super("Demo 2");
        p=new JPanel();

        // t=new JTree();
        DefaultMutableTreeNode Style = new DefaultMutableTreeNode("style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Font");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Font");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Font");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Font");
       Style.add(color);
        color.add(red);
        color.add(green);
        red.add(font);
        color.add(blue);
        color.add(black);
        JTree jt = new JTree(Style);
        
        Border br= BorderFactory.createTitledBorder("login");
        p.setBorder(br);
        p.add(jt);
        // p.add(color);
        add(p);

    }
}
public class JTrees {
    public static void main(String[] args) {
        MyFrame3 f=new MyFrame3();
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
