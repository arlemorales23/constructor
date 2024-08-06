package dataReading;

import javax.swing.*;

public class MainSumJpane {
    public static void main(String[] args) {
        Addition addition = new Addition();

        addition.n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 1: "));

        addition.n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 2: "));

        JOptionPane.showMessageDialog(null,"La suma es :" + addition.add());

    }
}
