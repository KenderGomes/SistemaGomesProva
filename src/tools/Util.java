/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
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
    
 
   public static int perguntar(String mensagem){
       return 0;
   }
    
    public static int strToInt(String cad) {
        return 0;
    }

    public static double strToDouble(String cad) {
        return 0;
    }

    public static String strToDate(String cad) {
        return null;
    }

    public static String intToStr(int num) {
        return "";
    }

    public static String doubleToStr(double num) {
        return "";
    }

    public static Date dateToStr(Date data) {
        return null;
    }
}
