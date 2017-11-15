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
import java.util.*;
public class URI1080 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int posicao = 0;
        int maior = 0;
        int troca = 0, auxiliar = 0;
        for (int i = 1; i <= 100; i++){
            int a = input.nextInt();
            auxiliar++;
                if (a > maior){
                    posicao = auxiliar;
                    maior = a;
                }
        }
        System.out.printf("%d\n", maior);
        System.out.printf("%d\n", posicao);
    }
}
