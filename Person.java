/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootyourshot;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;



/**
 *
 * @author 800543
 */
public class Person {
     private int height, width, x, y;
    private Image img;
    private ImageIcon ii;  
        public Person (int cWidth, int cHeight) {    
        this.x = cWidth / 4;
        this.y = 390;
        this.width = 600;
        this.height = 200;
        this.ii = new ImageIcon(getClass().getResource("scottpilgrim_multiple.gif"));
        this.img = ii.getImage();
        }

       public void draw(Graphics g) {
       g.drawImage(img, this.x, this.y, this.width, this.height, null);
        
    }
}
