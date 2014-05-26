package GameDevTut_03; /**
 * Created by ew513_000 on 5/19/2014.
 */

import java.awt.*;
import javax.swing.JFrame;

public class GameDevTutThree extends JFrame{
    public static void main(String[] args) {
        DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN);
        GameDevTutThree gdt2 = new GameDevTutThree();
        gdt2.run(dm);
    }

    private void run(DisplayMode dm) {
        setBackground(Color.PINK);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.PLAIN, 24));

        Screen s = new Screen();
        try{
            s.setFullScreen(dm, this);
            try{
                Thread.sleep(5000);
            }catch(Exception e){}
        }finally{
            s.restoreScreen();
        }
    }

    public void paint(Graphics g){
        if (g instanceof Graphics2D) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        }
        super.paint(g);
        g.drawString("this is gona be cool", 200, 200);
    }
}

