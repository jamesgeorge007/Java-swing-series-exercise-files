import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Buttons extends JFrame {
JButton b1,b2;
    public Buttons()
{
 super("Buttons");
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(400,400);
 setVisible(true);
 setResizable(false);
 setLayout(new FlowLayout());
 b1=new JButton("Click Me!");
 b1.setToolTipText("Nothing happens!");
 add(b1);
 b2=new JButton("Me Too!");
 b2.setToolTipText("Nothing Hapens");
 add(b2);
}
public static void main(String[]args)
    {
        Buttons gui=new Buttons();
    }
}
