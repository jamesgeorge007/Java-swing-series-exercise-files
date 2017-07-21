import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class combo
    {
        JFrame frame;
        JComboBox cb;
        public combo()
        {
             frame=new JFrame("Combo Box");
             String nations[]={"India","China","USA","Russia"};
             cb=new JComboBox(nations);
             cb.setBounds(40,40,90,20);
             cb.setSelectedIndex(2);
             frame.add(cb);
             frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
             frame.setLayout(null);
             frame.setVisible(true);
             frame.setSize(400,500);
             frame.setResizable(false);
        }
    public static void main(String[] args) {
        new combo();
    }
}

