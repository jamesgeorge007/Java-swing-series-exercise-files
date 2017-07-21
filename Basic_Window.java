import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Basic_Window extends JFrame
{
    public Basic_Window()
    {
      super("Basic Window");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setSize(400,400);
      setResizable(false);
    }
    public static void main(String[]args)
 {
   Basic_Window gui=new Basic_Window();
 }
}
