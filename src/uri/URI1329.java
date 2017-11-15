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

public class URI1329 {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            long pontuacao[] = new long[1000];
            int n;
            while ((n = input.nextInt()) != 0) {
                if (n == 0) {
                    break;
                }
                int j = 0;
                while (j < n) {
                    pontuacao[j] = input.nextLong();
                    j ++;
                }
                long mary = 0;
                long jhon = 0;
                for (int i = 0; i < n; i++) {
                    if (pontuacao[i] == 0) {
                        mary++;
                    } else {
                        jhon += 1;
                    }
                }
                System.out.printf("Mary won %d times and John won %d times\n", mary, jhon);
            }
    }
}
