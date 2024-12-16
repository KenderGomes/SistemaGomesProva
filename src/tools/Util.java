/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u08883230183
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... comp) {
        for (int i = 0; i < comp.length; i++) {
            comp[i].setEnabled(valor);

        }
    }

    public static void limpar(JComponent... comp) {
        for (int i = 0; i < comp.length; i++) {
            if (comp[i] instanceof JTextField) {
                ((JTextField) comp[i]).setText("");
            }
            if (comp[i] instanceof JComboBox) {
                ((JComboBox) comp[i]).setSelectedIndex(-1);
                
            }
            if (comp[i] instanceof JCheckBox) {
                ((JCheckBox) comp[i]).setSelected(false);
                
            }
        }
    }
    
 
   public static boolean perguntar(String mensagem){
       int option = JOptionPane.showConfirmDialog(null, mensagem, "Pergunta", JOptionPane.YES_OPTION);
            if(option ==JOptionPane.YES_OPTION){
            return true;
   }
            return false;
   }
    
    public static int strToInt(String cad) {
        return Integer.parseInt(cad);
    }

    public static double strToDouble(String cad) {
        return 0.0;
    }

    public static String strToDate(String cad) {
        return null;
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static String doubleToStr(double num) {
        return "";
    }

    public static Date dateToStr(Date data) {
        return null;
    }
    
    public static void mostrar(String mensagem){
    JOptionPane.showMessageDialog(null, mensagem);
}
}