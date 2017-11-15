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
import java.lang.*;
public class URI1015 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float x1 = teclado.nextFloat();
        float y1 = teclado.nextFloat();
        float x2 = teclado.nextFloat();
        float y2 = teclado.nextFloat();
        float distancia = ((x2 - x1)*(x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.printf("%.4f\n", Math.sqrt(distancia));
    }
}
