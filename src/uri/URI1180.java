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

public class URI1180 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros;
        int entrada;
        int menor, posicao = 0;
        numeros = input.nextInt();
        int i;
        int vetor[] = new int[numeros + 1];
        for (i = 0; i < numeros; i++) {
            vetor[i] = input.nextInt();
        }
        menor = vetor[0];
        for (i = 1; i < numeros; i++){
            if (menor > vetor[i]){
                menor = vetor[i];
                posicao = i;
        }
            
        }
        System.out.printf("Menor valor: %d\n",menor);
        System.out.printf("Posicao: %d\n",posicao);
    }
}
