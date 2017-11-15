/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

/**
 *
 * @author Desktop
 */
import java.util.*;
import java.lang.*;

public class URI1017 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float x = teclado.nextFloat();
        float y = teclado.nextFloat();
        float z = (x / 12) * y;
        System.out.printf("%.3f\n", z);
    }
}
