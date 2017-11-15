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
public class URI1079 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        double x1, x2, x3;
        double soma;
        for (int i = 0; i < a; i++){
            x1 = input.nextDouble();
            x2 = input.nextDouble();
            x3 = input.nextDouble();
            soma = ((x1/5.0) + ((x2*3.0)/10.0) + (x3 /2.0));
            System.out.printf("%.1f\n", soma);
        }
    }
}
