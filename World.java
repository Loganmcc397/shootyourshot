/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootyourshot;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 800543
 */
public class World extends JPanel{
    private Timer timer;
    private Person player;
    private Image img;
    private ImageIcon ii;
    private Image img2;
    private ImageIcon ii2; 
    int counter = 0;
    public World() {
        super();
        timer = new Timer();
        player = new Person(1519,525);
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/60);
        this.ii = new ImageIcon(getClass().getResource("animestreet.jpg"));
        this.img = ii.getImage();
        this.ii2 = new ImageIcon(getClass().getResource("download (3).png"));
        this.img2 = ii2.getImage();
    }
    
      @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
       counter++;
        if (counter < 120) {
        g.drawImage(img, 0, 0, 1519, 525, null);
       }
        else if (counter > 120) {
        g.drawImage(img2, 0, 0, 1519, 525, null);
       }
        player.draw(g);
    }

    
        private class ScheduleTask extends TimerTask {

        @Override
        public void run() {         
            repaint();
        }
    }
}

