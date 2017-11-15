/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

/**
 *
 * @author gabriel
 */
import java.util.*;
public class URI1041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x == 0 && y == 0){
            System.out.printf("Origem\n");
        }
        if (x > 0 && y < 0){
            System.out.printf("Q4\n");
        }
        if (x > 0 && y > 0){
            System.out.printf("Q1\n");
        }
        if (x < 0 && y < 0){
            System.out.printf("Q3\n");
        }
        if (x < 0 && y > 0){
            System.out.printf("Q2\n");
        }
        if (x == 0 && y != 0){
            System.out.printf("Eixo Y\n");
        }
        if (y == 0 && x != 0){
            System.out.printf("Eixo X\n");
        }
    }
}
