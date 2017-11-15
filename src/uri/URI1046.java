/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

/**
 *
 * @author Gabriel
 */
import java.util.*;
public class URI1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a == b){
            System.out.printf("O JOGO DUROU 24 HORA(S)\n");
        }
        if (a < b){
            System.out.printf("O JOGO DUROU %d HORA(S)\n", (b - a));
        }
        if (a > b){
            System.out.printf("O JOGO DUROU %d HORA(S)\n", ((24 - a) + b));
        }
    }
}
