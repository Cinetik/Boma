import javax.swing.*;
import java.awt.*;

/**
 * Created by cin3t on 5/15/2017.
 */
public class Signal extends JPanel {
    private Color color;
    private State state;
    int radius = 50;
    int border = 15;

    public Signal(Color color, State state) {
        this.color = color;
        this.state = state;
    }

    public Dimension getPreferredSize() {
        int size = (radius + border) * 2;
        return new Dimension(size, size);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(this.color);
        g.fillOval(border, border, radius, radius);
        repaint();
    }


}
