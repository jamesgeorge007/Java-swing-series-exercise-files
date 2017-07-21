import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Grid extends JFrame{
    Label l1,l2;
    JButton b1,b2;
    TextField t1,t2;
    public Grid()
    {
        super("Grid Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(250,250);
        setResizable(false);
        setLayout(new GridLayout(3,2));
        l1=new Label("I'm label One");
        add(l1);
        l2=new Label("I'm label Two");
        add(l2);
        b1=new JButton("I'm buton One");
        add(b1);
        b2=new JButton("I'm button Two");
        add(b2);
        t1=new TextField(5);
        add(t1);
        t2=new TextField(5);
        add(t2);
    }
public static void main(String[]args)
{
   Grid gui=new Grid();
}
}
