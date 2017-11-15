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
public class URI1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int X = teclado.nextInt();
        float Y = teclado.nextFloat();
        System.out.printf ("%.3f km/l\n", X / Y);
    }
}
