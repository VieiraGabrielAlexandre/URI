/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

/**
 *
 * @author internet
 */
public class URI1047 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int tmp, hrs;
        tmp = c - a;
        if (tmp < 0){
            tmp = 24 + (c - a);
        }
        hrs = d - b;
        if (hrs < 0){
            hrs = 60 + (d - b);
            tmp --;
        }
        if (a == b && c == d){
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
        }
        else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", tmp, hrs);
        }
    }
}
