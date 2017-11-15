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
public class URI1007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();
        int DIFERENCA = (A * B - C * D);
        System.out.printf("DIFERENCA = %d\n",DIFERENCA);
    }
	
 }
