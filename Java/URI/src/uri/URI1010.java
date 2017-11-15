/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;
import java.util.*;
/**
 *
 * @author gabriel
 */
public class URI1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        float C = teclado.nextFloat();
        int AI = teclado.nextInt();
        int BI = teclado.nextInt();
        float CI = teclado.nextFloat();
        float D = ((B * C) + (BI * CI));
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", D);
    }
}
