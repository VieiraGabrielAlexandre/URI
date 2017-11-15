/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uri;
import java.util.*;
/**
 *
 * @author Gabriel
 */
public class URI1037 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double a = input.nextDouble();
        if (a >= 0 && a <= 25){   
            System.out.printf("Intervalo [0,25]\n");
        } else if (a > 25 && a <= 50){
            System.out.printf("Intervalo (25,50]\n");
        } else if (a > 50 && a <= 75){
            System.out.printf("Intervalo (50,75]\n");
        } else if (a > 75 && a <= 100){
            System.out.printf("Intervalo (75,100]\n");
        } else {
            System.out.printf("Fora de intervalo\n");
        }
    }
}
    