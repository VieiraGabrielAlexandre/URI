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

public class URI1174 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vetor[] = new double[100];
        double captura = 0;
        for (int i = 0; i < 100; i++) {
            vetor[i] = input.nextDouble();
        }
        for (int i = 0; i < 100; i++) {
            if (vetor[i] <= 10.0) {
                System.out.printf("A[%d] = %.1f\n", i, (double)vetor[i]);
            }
        }
    }
}
