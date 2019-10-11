/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootyourshot;

import javax.swing.JFrame;

/**
 *
 * @author 800543
 */
public class ShootYourShot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame j = new JFrame();
        World c = new World();
        j.add(c);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(1519, 525);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
    }
    
}
