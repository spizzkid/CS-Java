
// Jiacheng Jiang
// cs 141 aug 19
import java.awt.*;

public class assignment23 {
    public static void main(String [] args) {

        // create a panel
        DrawingPanel panel = new DrawingPanel(1000, 1000);
        Graphics g = panel.getGraphics();

        Color saveColor = g.getColor();

        // set engine's color and draw the engine
        Color engine = new Color(192,192,192);
        g.setColor(engine);
        g.fillOval(450,100, 100, 50);
        g.fillRect(420,110,50,20);


        g.setColor(saveColor);              // reset color
        // set color for window and draw the window
        g.fillRect(475, 80, 50,40);

        Color window = new Color(51, 238, 255);
        g.setColor(window);

        g.fillRect(490,90,25,25);




        // set color for bole and leaf then draw them
        Color bole = new Color(80, 39, 42);
        g.setColor(bole);
        g.fillRect(120,480,80,220);
        g.fillRect(420,480,70,230);
        g.fillRect(840,480,95,225);

        Color leaf = new Color(54, 111, 66);
        g.setColor(leaf);
        g.fillOval(100,450,120,120);
        g.fillOval(400,450,110,180);
        g.fillOval(800,450,170,130);

        g.setColor(saveColor);


        // set color for face and body of people, then draw them
        Color face = new Color(250,188,157);
        g.setColor(face);
        g.fillOval(300,700,50,50);
        g.fillOval(680,450,50,50);

        Color body = new Color(26,60,105);
        g.setColor(body);
        g.fillRect(300,750,50,80);
        g.fillRect(680,500,50,80);

    }
    public void drawPeople(Graphics g) {

    }
}
