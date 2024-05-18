package GUI;

import java.awt.event.*;
// import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyINternalFrame extends JInternalFrame {
    static int count = 0;

    JTextArea ta;
    JScrollPane sp;

    MyINternalFrame() {
        super("Document" + (++count), true, true, true, true);
        ta = new JTextArea();
        sp = new JScrollPane();
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300, 300);
        setLocation(50, 50);
        setVisible(true);

    }
}

class MyFrames extends JFrame implements ActionListener {
    JDesktopPane jp;

    MyFrames() {
        super("document");
        jp = new JDesktopPane();
        setContentPane(jp);
        JMenuBar mb = new JMenuBar();
        JMenu jm = new JMenu("File");
        JMenuItem m2 = new JMenuItem("New");

        jm.add(m2);
        mb.add(jm);
        setJMenuBar(mb);
        m2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        MyINternalFrame m = new MyINternalFrame();
        jp.add(m);

    }

}

public class DocumentGenerate {

    public static void main(String[] args) {

        MyFrames m = new MyFrames();
        m.setSize(800, 800);
        // m.setVisibleible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setTitle("Document Generator");
        // m.setResizable(false);
        // m.setLocationRelativeTo(null);//center

    }
}
