/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import javax.swing.JOptionPane;

/**
 *
 * @author JonatanVT
 */
public class DataValidation {
    public int string2double(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value);
        }catch (NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor");
            result = 0;
            
       }
        return result;
    }
    public int string2int(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value);
        }catch (NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor");
            result = 0;
            
       }
        return result;
    }
    public int string2float(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value);
        }catch (NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor");
            result = 0;
            
       }
        return result;
    }
}
