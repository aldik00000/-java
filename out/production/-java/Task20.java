import javax.swing.*;
import java.awt.*;

public class Task20 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2=(Graphics2D)g;

        int width=getWidth();
        int height=getHeight();

        int centerX=width/2;
        int centerY=height/2;

        g2.drawLine(0,centerY,width,centerY);
        g2.drawLine(centerX,0,centerX,height);

        int prevX=0, prevY=0;
        boolean first=true;

        for(double x=-10;x<=10;x+=0.05){

            if(x==0) continue;

            double y=(x*x - 3)/x;

            int drawX=centerX+(int)(x*30);
            int drawY=centerY-(int)(y*5);

            if(!first) g2.drawLine(prevX, prevY, drawX, drawY);

            prevX=drawX;
            prevY=drawY;
            first=false;
        }
    }

    public static void main(String[] args){
        JFrame frame=new JFrame("y = (x^2 - 3)/x");
        frame.add(new Task20());
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
