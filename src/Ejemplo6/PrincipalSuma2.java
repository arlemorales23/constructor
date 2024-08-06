package Ejemplo6;

import javax.swing.*;

public class PrincipalSuma2 {
    public static void main(String[] args) {
        Suma2n suma2n = new Suma2n(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese num1: ")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese num2: ")));
        System.out.println(suma2n.sumar());
    }
}
