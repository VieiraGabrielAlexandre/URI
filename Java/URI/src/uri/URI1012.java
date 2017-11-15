/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

/**
 *
 * @author gabriel
 */
import java.util.*;
public class URI1012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float A = teclado.nextFloat();
        float B = teclado.nextFloat();
        float C = teclado.nextFloat();
        System.out.printf("TRIANGULO: %.3f\n", (A * C) / 2);
        System.out.printf("CIRCULO: %.3f\n", (C * C) * 3.14159);
        System.out.printf("TRAPEZIO: %.3f\n", (A + B) * (C) / 2);
        System.out.printf("QUADRADO: %.3f\n", B * B);
        System.out.printf("RETANGULO: %.3f\n", A * B);
    }
}
