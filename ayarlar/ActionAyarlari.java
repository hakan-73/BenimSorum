/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import javax.swing.JFrame;

/**
 *
 * @author Hakan
 */
public class ActionAyarlari {
    public static void SetVisible(JFrame oldFrame,JFrame newFrame){
        oldFrame.setVisible(false);
        newFrame.setVisible(true);
    }
}
