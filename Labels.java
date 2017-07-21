import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Labels extends JFrame {
    Label l1,l2;
    public Labels()
    {
        super("Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,400);
        setResizable(false);
        setLayout(new FlowLayout());
        l1=new Label("Hello World!");
        add(l1);
        l2=new Label("Hey!");
        add(l2);
    }
    public static void main(String[]args)
    {
       Labels gui=new Labels();
    }
}
