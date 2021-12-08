/*Ejercicio3: Hacer un programa que lea un caracter por teclado 
y compruebe si es una letra mayúscula */
package ejer3_condicionales;

import javax.swing.JOptionPane;

public class Ejer3_condicionales {

    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if (Character.isUpperCase (letra)){
            JOptionPane.showMessageDialog (null, "Es una letra mayúscula");
        }
        else {
            JOptionPane.showMessageDialog (null, "Es una letra minuscúla");
        }
        
    }
    
}
