package GameDevTut_08;

import javafx.scene.Scene;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ew513_000 on 5/31/2014.
 */
public class GameDevTutEight {

    public static void main(String[] args) {
        DisplayMode displayMode= new DisplayMode(800,800,16,DisplayMode.REFRESH_RATE_UNKNOWN);
        GameDevTutEight gdte = new GameDevTutEight();
        gdte.run(displayMode);
    }

    private Screen screen;
    private Image bg;
    private Animation a;

    public void loadPics(){
        bg = new ImageIcon(this.getClass().getResource("img/icons.jpg")).getImage();
        Image pic1 = new ImageIcon(this.getClass().getResource("img/rabbit.jpg")).getImage();
        Image pic2 = new ImageIcon(this.getClass().getResource("img/duck.jpg")).getImage();

        a = new Animation();
        a.addScene(pic1,250);
        a.addScene(pic2,250);
    }

    public void run(DisplayMode dm){
        screen = new Screen();
        try{
            screen.setFullScreen(dm, new JFrame());
            loadPics();
            movieLoop();
        }finally{
            screen.restoreScreen();
        }
    }
}
