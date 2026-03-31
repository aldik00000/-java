import javax.swing.*;
import java.awt.*;

public class Task5 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2=(Graphics2D)g;

        int width=getWidth();
        int height=getHeight();

        int centerX=width/2;
        int centerY=height/2;

        g2.drawLine(0,centerY,width,centerY);
        g2.drawLine(centerX,0,centerX,height);

        int prevX=0;
        int prevY=0;
        boolean first=true;

        for(double x=-3;x<=3;x+=0.01){

            double y=Math.pow(x,5);

            int drawX=centerX+(int)(x*50);
            int drawY=centerY-(int)(y*2);

            if(!first){
                g2.drawLine(prevX,prevY,drawX,drawY);
            }

            prevX=drawX;
            prevY=drawY;
            first=false;
        }
    }

    public static void main(String[] args){

        JFrame frame=new JFrame("y = x^5");

        frame.add(new Task5());
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


