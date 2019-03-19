//sample project....just for basic testing
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FIrstLook extends JFrame implements ActionListener {
JButton b1=new JButton("click");
JTextField t1=new JTextField("click button");
FIrstLook(){
    b1.setBounds(100,300,100,40);
    setSize(600,600);
    t1.setBounds(20,50,600,70);
    b1.addActionListener(this);
    add(b1);
    add(t1);
    setVisible(true);
    setLayout(null);

}

    @Override
    public void actionPerformed(ActionEvent e) {
t1.setText("you clicked me");
    }
}

public class project1 {
    public static void main(String[] args) {
        FIrstLook f1=new FIrstLook();
    }
}
