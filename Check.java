import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Check extends JFrame{
     Label l1;
     JCheckBox c1,c2,c3,c4;
     ButtonGroup bg;
     public Check()
     {
       super("CheckBox");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       setSize(400,400);
       setResizable(false);
       setLayout(new FlowLayout());
       l1=new Label("Hobbies:");
       add(l1);
       c1=new JCheckBox("Playing");
       add(c1);
       c2=new JCheckBox("Watching TV");
       add(c2);
       c3=new JCheckBox("Listening Music");
       add(c3);
       c4=new JCheckBox("Coding...");
       add(c4);
       bg=new ButtonGroup();
       bg.add(c1);
       bg.add(c2);
       bg.add(c3);
       bg.add(c4);
     }
     public static void main(String[]args)
     {
         Check gui=new Check();
     }
}
