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

public class URI1116 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a, b;
        double divisao;

        try {
            for (int i = 0; i < num; i++) {
                a = input.nextInt();
                b = input.nextInt();
                divisao = (double) a / b;
                System.out.printf("%.1f\n", divisao);
            }
        } catch (ArithmeticException e) {
            System.out.printf("divisao impossivel\n");
        }

    }
}
