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

public class URI1020 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int idade = teclado.nextInt();
        int ano = idade / 365;
        int mes = (idade % 365) / 30;
        int dia = (idade % 365) % 30;
            if(mes >= 12){
                ano = ano + 1;
                mes = 0;
            }
            System.out.printf("%d ano(s)\n", ano);
            System.out.printf("%d mes(es)\n", mes);
            System.out.printf("%d dia(s)\n", dia);
    }
}
