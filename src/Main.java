import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame();
        frame.setSize(1280, 720);
        frame.setTitle("Drawing Frame");
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.GREEN);

        // Add drawing component to Jframe
        frame.add(new Drawing());

        // Make frame visible
        frame.setVisible(true);
    }
}

class Drawing extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        // Draw Head
        drawGrayCircle(g, 500, 200, 300, 300);
        //Draw Ears
        drawEars(g, 550, 100, 50, 110);
        //drawEars(g, 540, 130, 50, 110);
       drawEars(g, 700, 100, 50, 110);
//        drawEars(g, 690, 130, 50, 110);

        // Left eye
        drawWhiteCircle(g, 550, 300, 50, 50);
        drawBlackCircle(g, 550, 300, 40, 40);

        // Right eye
        drawWhiteCircle(g, 700, 300, 50, 50);
        drawBlackCircle(g, 700, 300, 40, 40);

        // Teeth
        drawWhiteRectangle(g, 630, 415, 10, 50);
        drawWhiteRectangle(g, 650, 415, 10, 50);

        // Pink nose
        drawPinkCircle(g, 620, 370, 50, 50);

        // Mouth Left
        drawGrayCircle(g, 575, 390, 70, 70);

        // Mouth Right
        drawGrayCircle(g, 645, 390, 70, 70);
        //mustache Left
        drawLine(g, 610, 410, 570, 410);
        drawLine(g, 610, 410, 550, 400);
        drawLine(g, 550, 440, 600, 410);
        // mustache Right
        drawLine(g, 690, 410, 750, 410);
        drawLine(g, 690, 410, 750, 390);
        drawLine(g, 690, 410, 750, 440);
        g.drawString("Var 15", 650, 100);
        g.drawString("Hi I'm rabbit",600,600);

    }


        public void drawGrayCircle (Graphics g,int x, int y, int xS, int yS){
            g.setColor(Color.GRAY);
            g.fillOval(x, y, xS, yS);
            g.setColor(Color.BLACK);
            g.drawOval(x, y, xS, yS);
        }

        public void drawWhiteCircle (Graphics g,int x, int y, int xS, int yS){
            g.setColor(Color.WHITE);
            g.fillOval(x, y, xS, yS);
            g.setColor(Color.BLACK);
            g.drawOval(x, y, xS, yS);
        }

        public void drawBlackCircle (Graphics g,int x, int y, int xS, int yS){
            g.setColor(Color.BLACK);
            g.fillOval(x, y, xS, yS);
        }

        public void drawPinkCircle (Graphics g,int x, int y, int xS, int yS){
            g.setColor(Color.PINK);
            g.fillOval(x, y, xS, yS);
            g.setColor(Color.BLACK);
            g.drawOval(x, y, xS, yS);
        }

        public void drawWhiteRectangle (Graphics g,int x, int y, int xS, int yS){
            g.setColor(Color.WHITE);
            g.fillRect(x, y, xS, yS);
            g.setColor(Color.BLACK);
            g.drawRect(x, y, xS, yS);
        }
        public void drawLine (Graphics g,int x, int y, int xS, int yS){
            g.setColor(Color.BLACK);
            g.drawLine(x, y, xS, yS);
        }
        public void drawEars (Graphics g,int x, int y, int xS, int yS){
            g.fillOval(x, y, xS, yS);
            //g.setColor(Color.pink);
            g.drawOval(x, y, xS, yS);
        }

        }
