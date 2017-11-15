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
public class URI1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        float C = teclado.nextFloat(); 
        float D = B * C;
        System.out.printf("NUMBER = %d\n", A);
        System.out.printf("SALARY = U$ %.2f\n", D);
    }
}
