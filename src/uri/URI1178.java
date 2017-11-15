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
import java.util.Scanner;

public class URI1178 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double entrada = input.nextDouble();
        double metade, fim, aux;
        System.out.printf("N[0] = %.4f\n", entrada);
        for (int i = 1; i <= 99; i++) {
            metade = entrada / 2;
            fim = metade;
            entrada = metade;
            System.out.printf ("N[%d] = %.4f\n", i , entrada);
        }
    }
}
