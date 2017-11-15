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
public class URI1176 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long a,b, aux = 0;
        long inicio = 0, elemento = 1;
        for (int i = 0; i <n; i++, inicio = 0, elemento = 1){
            a = input.nextLong();
            a ++;
            for (int j = 0; j < a; j++){
                if (j <= 1){
                    aux = j;
                }
                else {
                    aux = inicio + elemento;
                    inicio = elemento;
                    elemento = aux;
                }
            }
            System.out.println("Fib("+(a-1)+") = "+aux);
        }
    }
}
