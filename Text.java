import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Text extends JFrame{
    TextField tf;
    public Text()
    {
        super("TextField");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,400);
        setResizable(false);
        setLayout(new FlowLayout());
        tf=new TextField(8);
        add(tf);
    }
    public static void main(String[]args)
    {
        Text gui=new Text();
    }
}
