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

public class URI1113 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int conta = 0;
        while (conta <= 1) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == b) {
                conta++;
                break;
            } else {
                if (a > b){
                    System.out.println("Decrescente");
                } else if (b > a ){
                    System.out.println("Crescente");
                }
            }
        }
    }
}
