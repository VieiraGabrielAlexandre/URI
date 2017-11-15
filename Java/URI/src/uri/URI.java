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
public class URI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double MEDIA = 0;
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        if (A <= 10.0 && B <= 10.0 && C <= 10.0){
            MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10.0;
        }
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
    
}
