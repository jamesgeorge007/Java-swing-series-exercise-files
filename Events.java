import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Events extends JFrame{
    private Label l1,l2;
    private JButton b1,b2;
    private int x=0,y=0;
    public Events()
    {
        super("Events");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400,400);
      setVisible(true);
      setResizable(false);
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
      l1=new Label("              ");
      c.gridx=0;
      c.gridy=1;
      add(l1,c);
      l2=new Label("               ");
      c.gridx=1;
      c.gridy=1;
      add(l2,c);
      event e=new event();
      b1.addActionListener(e);
      b2.addActionListener(e);
    }
    class event implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String op=e.getActionCommand();
            if(op.equals("Click Me!"))
            {
                if(x==0)
                {
                    l1.setText("Words!");
                    x=1;
                }
                else if(x==1)
                {
                    l1.setText("");
                    x=0;
                }
            }
            else if(op.equals("Me Too!"))
            {
                if(y==0)
                {
                    l2.setText("Words!");
                    y=1;
                }
                else if(y==1)
            {
                l2.setText("");
                y=0;
            }
            }
        }
    }
    public static void main(String[]args)
    {
        new Events();
    }
}
