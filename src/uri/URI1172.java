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
public class URI1172 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int vetor[] = new int [10];
        for (int i = 0; i < 10; i++){
            vetor [i] = input.nextInt();
            if (vetor[i] <= 0){
                vetor [i] = 1;
            }
            System.out.printf("X[%d] = %d\n", i, vetor[i]);
        }
    }
}
