package GameDevTut_07;

/**
 * Created by ew513_000 on 5/25/2014.
 */

import java.awt.*;
import javax.swing.*;

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
            loadPics();
            try{
                Thread.sleep(5000);
            }catch(Exception e){}
        }finally{
            s.restoreScreen();
        }
    }

    private void loadPics() {
        bg = new ImageIcon(this.getClass().getResource("img/20140526-google_doodle.jpg")).getImage();
        pic = new ImageIcon(this.getClass().getResource("img/20140526-icons.jpg")).getImage();
        loaded = true;
        repaint();
    }

    public void paint(Graphics g){
        if (g instanceof Graphics2D) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        }
        if(loaded){
            g.drawImage(bg,0,0,null);
            g.drawImage(pic,170,180,null);
        }
    }
}

