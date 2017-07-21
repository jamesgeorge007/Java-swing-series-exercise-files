import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Multiple_Events extends JFrame{
    private Label l1,l2;
    private JButton b1,b2;
    private int x=0,y=0;
    public Multiple_Events()
    {
      super("Multiple Events");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400,400);
      setResizable(false);
      setVisible(true);
      setLayout(new GridBagLayout());
      GridBagConstraints c=new GridBagConstraints();
      b1=new JButton("Click Me!");
      c.gridx=0;
      c.gridy=0;
      add(b1,c);
      b2=new JButton("Me Too!");
      c.gridx=1;
      c.gridy=0;
      add(b2,c);
      l1=new Label("                         ");
      c.gridx=0;
      c.gridy=1;
      add(l1,c);
      l2=new Label("                         ");
      c.gridx=1;
      c.gridy=1;
      add(l2,c);
      event1 e1=new event1();
      event2 e2=new event2();
      b1.addActionListener(e1);
      b2.addActionListener(e2);
    }
    class event1 implements ActionListener
    {
      public void actionPerformed(ActionEvent e1)
      {
        if(x==0)
        {
            l1.setText("Words visible");
            x=1;
        }
        else if(x==1)
        {
            l1.setText("");
            x=0;
        }
      }
    }
    class event2 implements ActionListener{
        public void actionPerformed(ActionEvent e2)
        {
           if(y==0)
           {
               l2.setText("Words visible");
               y=1;
           }
           else if(y==1)
           {
               l2.setText("");
               y=0;
           }
        }
    }
    public static void main(String[]args)
    {
        new Multiple_Events();
    }
}
