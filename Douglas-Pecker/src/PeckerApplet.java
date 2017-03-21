import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PeckerApplet extends Applet implements MouseListener {

    // The x-pos and y-pos of the click
    int xpos, ypos;
    ArrayList<Point> points = new ArrayList<Point>();

    @Override
    public void init() {
        this.xpos = 0;
        this.ypos = 0;
        this.addMouseListener(this);
    }

    @Override
    public void paint(final Graphics g) {
        g.setColor(Color.MAGENTA);
        for (int i = 0; i < this.points.size() - 1; i++)
            g.drawLine(this.points.get(i).x, this.points.get(i).y,
                    this.points.get(i + 1).x, this.points.get(i + 1).y);

    }

    @Override
    public void mouseClicked(final MouseEvent e) {
        // TODO Auto-generated method stub
        this.xpos = e.getX();
        this.ypos = e.getY();
        this.points.add(new Point(this.xpos, this.ypos));

    }

    @Override
    public void mousePressed(final MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(final MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(final MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(final MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
