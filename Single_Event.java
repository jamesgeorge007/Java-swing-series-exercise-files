import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Single_Event extends JFrame{
    private JButton b1;
    private Label l1;
    private int x=0;
    public Single_Event()
    {
      super("Single Events");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400,400);
      setVisible(true);
      setResizable(false);
      setLayout(new GridBagLayout());
     GridBagConstraints c=new GridBagConstraints();
      b1=new JButton("Click me!");
      c.gridx=0;
      c.gridy=0;
      add(b1,c);
      l1=new Label("                                             ");
      c.gridx=0;
      c.gridy=1;
      add(l1,c);
      event e=new event();
      b1.addActionListener(e);
    }
    public class event implements ActionListener
    {
     public void actionPerformed(ActionEvent e)
     {
         if(x==0)
         {
             l1.setText("Now you can see words here!");
             x=1;
         }
         else if(x==1)
         {
             l1.setText("");
             x=0;
         }
     }
    }
    public static void main(String[]args)
    {
        new Single_Event();
    }
}
