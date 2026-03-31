import javax.swing.*;
import java.awt.*;

public class Task14 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2=(Graphics2D)g;

        int width=getWidth();
        int height=getHeight();

        int centerX=width/2;
        int centerY=height/2;

        // Осьтер
        g2.drawLine(0,centerY,width,centerY);
        g2.drawLine(centerX,0,centerX,height);

        int prevX=0;
        int prevY=0;
        boolean first=true;

        for(double x=-10;x<=10;x+=0.05){

            if(x==-2) continue; // анықталу облысы

            double y = (Math.pow(x,3)+1)/(x+2);

            int drawX = centerX + (int)(x*30);
            int drawY = centerY - (int)(y*5);

            if(!first){
                g2.drawLine(prevX,prevY,drawX,drawY);
            }

            prevX = drawX;
            prevY = drawY;
            first=false;
        }
    }

    public static void main(String[] args){

        JFrame frame = new JFrame("y = (x^3 + 1)/(x + 2)");

        frame.add(new Task14());
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



