import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GridBag extends JFrame{
    private Label l1,l2;
    private JButton b1,b2;
    private TextField t1,t2;
    public GridBag()
    {
        super("GridBag Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setResizable(false);
        setVisible(true);
        setLayout(new GridBagLayout());
        GridBagConstraints c=new GridBagConstraints();
        l1=new Label("One!");
        c.gridx=0;
        c.gridy=0;
        add(l1,c);
        l2=new Label("Two!");
        c.gridx=1;
        c.gridy=0;
        add(l2,c);
        b1=new JButton("One!");
        c.gridx=0;
        c.gridy=1;
        add(b1,c);
        b2=new JButton("Two!");
        c.gridx=1;
        c.gridy=1;
        add(b2,c);
        t1=new TextField(7);
        c.gridx=0;
        c.gridy=2;
        add(t1,c);
        t2=new TextField(7);
        c.gridx=1;
        c.gridy=2;
        add(t2,c);
    }
    public static void main(String[]args)
    {
        GridBag gui=new GridBag();
    }
}
