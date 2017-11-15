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

public class URI1045 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double am = a;
        double bm = b;
        double cm = c;
        double maior;
        if ((a == 0)
                || (b == 0)
                || (c == 0)) {
            System.out.printf("NAO FORMA UM TRIANGULO\n");
        } else {
            if ((a >= b) && (a > b)) {
                maior = a;
            }
            if ((b >= a) && (b > c)) {
                maior = b;
                b = a;
            } else {
                maior = c;
                c = a;
            }
            if ((maior >= b + c)) {
                System.out.printf("NAO FORMA TRIANGULO\n");
            } else {
                if ((maior * maior) == (b * b) + (c * c)) {
                    System.out.printf("TRIANGULO RETANGULO\n");
                }
                if ((maior * maior) > ((b * b) + (c * c))) {
                    System.out.printf("TRIANGULO OBTUSANGULO\n");
                }
                if ((maior * maior) < ((b * b) + (c * c))) {
                    System.out.printf("TRIANGULO ACUTANGULO\n");
                }
                if ((am == bm) && (bm == cm)) {
                    System.out.printf("TRIANGULO EQUILATERO\n");
                }
                if ((am == bm) && (bm != cm)) {
                    System.out.printf("TRIANGULO ISOSCELES\n");
                }
                if ((am == cm) && (bm != am)) {
                    System.out.printf("TRIANGULO ISOSCELES\n");
                }
                if ((bm == cm) && (bm != am)) {
                    System.out.printf("TRIANGULO ISOSCELES\n");
                }
            }
        }
    }
}
