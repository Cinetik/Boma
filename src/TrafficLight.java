import java.awt.*;
import javax.swing.*;

public class TrafficLight extends JFrame {
    JButton b1, b2, b3;

    Signal green = new Signal(Color.green, State.ON);
    Signal yellow = new Signal(Color.yellow, State.ON);
    Signal red = new Signal(Color.red, State.ON);

    public TrafficLight(){
        super("Traffic Light");
        getContentPane().setLayout(new GridLayout(2, 1));

        JPanel p1 = new JPanel(new GridLayout(3,1));
        p1.add(red);
        p1.add(yellow);
        p1.add(green);
        JPanel p2 = new JPanel(new FlowLayout());

        getContentPane().add(p1);
        getContentPane().add(p2);
        pack();
    }


    public static void main(String[] args){
        TrafficLight tl = new TrafficLight();
        tl.setVisible(true);
    }
}
