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

public class URI1019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int N = teclado.nextInt();
        int segundos = 3600;
        int N_horas = (N / segundos);
        int N_minutos = (N - (segundos*N_horas))/60;
        int N_segundos = (N - (segundos*N_horas) - (N_minutos*60));
        System.out.printf("%d:%d:%d\n", N_horas,N_minutos,N_segundos);
    }
}
