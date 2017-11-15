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
public class URI1094 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int cobaias = input.nextInt();
        int total = 0;
        int sapo = 0, rato = 0, coelho = 0;
        for (int i =0; i < cobaias; i++){
            int num = input.nextInt();
            total =+ num;
            String tipo = input.nextLine();
            if ("S".equals(tipo)){
                sapo =+ num;
            }
            if ("R".equals(tipo)){
                rato =+ num;
            }
            if ("C".equals(tipo)){
                coelho =+ num;
            }
        }
        System.out.println(""+total);
        System.out.println(""+rato);
    }
}
