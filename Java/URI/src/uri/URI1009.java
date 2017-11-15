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
public class URI1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String nome = teclado.nextLine();
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double comissao = ((B * 0.15) + A);
        System.out.printf("TOTAL = R$ %.2f\n", comissao);
    }
}
