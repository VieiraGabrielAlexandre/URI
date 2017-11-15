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
public class URI1117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0, total = 0, captura;
        while (total < 2){
            captura = input.nextDouble();
            if (captura >= 0 && captura <= 10){
                total ++;
                media = captura + media;
            }
            else {
                System.out.println("nota invalida");
            }
        }
        System.out.printf("media = %.2f\n",media / 2);
    }
}
