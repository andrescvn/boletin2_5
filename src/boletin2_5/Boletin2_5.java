/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float ctn= 1852;
    float milla; 
    float metros;
    milla=Float.parseFloat(JOptionPane.showInputDialog("milla"));
    metros=milla*ctn;
    JOptionPane.showMessageDialog(null, "metros ="+ metros);
    }
    
}
