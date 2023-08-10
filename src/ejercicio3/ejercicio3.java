package ejercicio3;

import javax.swing.JOptionPane;

public class ejercicio3 {

    //3. Calculadora Simple:
//Crea una clase Calculadora que contenga métodos para realizar operaciones matemáticas básicas,
// como suma, resta, multiplicación y división.

    
    public static void main(String[] args) throws Exception {

        calculadora miCalculadora = new calculadora(10,2);

        JOptionPane.showMessageDialog(null, "La suma de los números es: " + miCalculadora.sumar());

        JOptionPane.showMessageDialog(null, "La resta de los números es: " + miCalculadora.restar());

        JOptionPane.showMessageDialog(null, "La multiplicación de los números es: " + miCalculadora.multiplicar());

        JOptionPane.showMessageDialog(null, "La suma de los números es: " + miCalculadora.dividir());
        }
}

