
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class TablaMultiplicar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadTerminos,numeroTabla;
        String result = "";//Acumulador
        numeroTabla = 
        Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Tabla: "));
        cantidadTerminos = 
        Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de terminos: "));
        
        for ( int i = 1 ; i <= cantidadTerminos ; i++) {
            result += numeroTabla + " X " + i + " = " + numeroTabla*i+"\n";
            //System.out.println(numeroTabla + " X " + i + " = " + numeroTabla*i);
        }
        JOptionPane.showMessageDialog(null,"Tabla de multiplicar del "+numeroTabla+"\n"+result);
    }
}
