import javax.swing.*;
import java.awt.*;

public class Task3 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2=(Graphics2D)g;

        int w=getWidth();
        int h=getHeight();

        int cx=w/2;
        int cy=h/2;

        g2.drawLine(0,cy,w,cy);
        g2.drawLine(cx,0,cx,h);

        int prevX=0,prevY=0;
        boolean first=true;

        for(double x=-10;x<=10;x+=0.05){

            double y=-x*x+3*x;

            int drawX=cx+(int)(x*30);
            int drawY=cy-(int)(y*30);

            if(!first)
                g2.drawLine(prevX,prevY,drawX,drawY);

            prevX=drawX;
            prevY=drawY;
            first=false;
        }
    }

    public static void main(String[] args){
        JFrame f=new JFrame("y=-x^2+3x");
        f.add(new Task3());
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}



