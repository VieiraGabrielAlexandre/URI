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
import java.util.Scanner;

public class URI1175 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i, j;
        int vetor[] = new int[20];
        for (i = 0; i < 20; i++) {
            vetor[i] = input.nextInt();
        }
        for (i = 0, j = 19; i < 10; i++, j--) {
            num = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = num;
        }
        for (i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }
}
