package GameDevTut_07; /**
 * Created by ew513_000 on 5/25/2014.
 */

import java.awt.*;
import javax.swing.JFrame;

public class GameDevTutSev extends JFrame{
    public static void main(String[] args) {
        DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN);
        GameDevTutSev gdt7 = new GameDevTutSev();
        gdt7.run(dm);
    }

    private GameDevTut_03.Screen s;
    private Image bg;
    private Image pic;
    private boolean loaded;

    private void run(DisplayMode dm) {
        setBackground(Color.PINK);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.PLAIN, 24));
        loaded = false;

        s = new GameDevTut_03.Screen();

        try{
            s.setFullScreen(dm, this);
            loadpics();
            try{
                Thread.sleep(5000);
            }catch(Exception e){}
        }finally{
            s.restoreScreen();
        }
    }

    private void loadpics() {

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

