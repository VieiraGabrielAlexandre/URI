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

public class URI1101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int conta = 0;
        while (conta <= 1) {
                int m = input.nextInt();
                int n = input.nextInt();
                if (m <= 0 || n <= 0) {
                conta++;
                break;
            } else {
                int maior;
                int menor;
                if (m > n) {
                    maior = m;
                    menor = n;
                } else {
                    maior = n;
                    menor = m;
                }
                int soma = 0;
                for (int i = menor; i <= maior; i++) {
                    System.out.printf("%d ", i);
                    soma += i;
                }
                System.out.printf("Sum=%d\n", soma);
            }
        }
    }
}
