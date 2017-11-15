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
import java.lang.*;
import java.util.*;
public class URI1036 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double delta = ((b * b) - (4 * a * c));
        if (delta < 0 || a == 0){
            System.out.printf("Impossivel calcular\n");
        } else {
            double r1 = (double)((-b + Math.sqrt(delta)) / (2 * a));
            double r2 = (double)((-b - Math.sqrt(delta)) / (2 * a));
            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R2 = %.5f\n",r2);
        }   
    }
}
