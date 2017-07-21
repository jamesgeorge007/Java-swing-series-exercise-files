import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Radio extends JFrame{
    Label l1;
    JRadioButton male,female;
    ButtonGroup bg;
    public Radio()
    {
       super("Radio");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       setSize(400,400);
       setResizable(false);
       setLayout(new FlowLayout());
       l1=new Label("Sex:");
       add(l1);
       male=new JRadioButton("Male");
       add(male);
       female=new JRadioButton("Female");
       add(female);
       bg=new ButtonGroup();
       bg.add(male);
       bg.add(female);
    }
    public static void main(String[]args)
    {
       Radio gui=new Radio();
    }
}
