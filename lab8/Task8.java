import javax.swing.*;
import java.awt.*;

public class Task8 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2=(Graphics2D)g;

        int w=getWidth();
        int h=getHeight();

        int cx=w/2;
        int cy=h/2;

        g2.drawLine(0,cy,w,cy);
        g2.drawLine(cx,0,cx,h);

        int prevX=0;
        int prevY=0;
        boolean first=true;

        for(double x=-10;x<=10;x+=0.05){

            if(x==0) continue;

            double y=1/x;

            int drawX=cx+(int)(x*40);
            int drawY=cy-(int)(y*40);

            if(!first){
                g2.drawLine(prevX,prevY,drawX,drawY);
            }

            prevX=drawX;
            prevY=drawY;
            first=false;
        }
    }

    public static void main(String[] args){

        JFrame frame=new JFrame("y = 1/x");

        frame.add(new Task8());
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
