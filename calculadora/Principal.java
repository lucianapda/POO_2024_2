/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author lpa
 */
public class Principal {
    public static void main(String[] args) {
        new Principal();
    }

    public Principal() {
        Scanner s = new Scanner(System.in);
        Calculadora c1 = new Calculadora();
        c1.setNum1(5);
        c1.setNum2(0);
        System.out.println("Soma = " + c1.getNum1() + "+" +
                c1.getNum2() + " = " + c1.somar());
        c1.subtrair(4,3);
        System.out.println("Subtrair = " + c1.getResultado());
        c1.dividir();
        System.out.println("Dividir = " + c1.getResultado());
        System.out.println("Multiplicar = " + c1.multiplicar(5, 2));
        s.close();
    }
   
    
    
}
