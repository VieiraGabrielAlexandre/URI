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
public class URI1115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int conta = 0;
        while (conta <= 2){
            int x = input.nextInt();
            int y = input.nextInt();
            if (x == 0 || y == 0){
                conta++;
                break;
            } else if (y == 0 && x == 0){
                conta ++;
                break;
            } else if (x > 0 && y > 0){
                System.out.printf("primeiro\n");
            } else if (x > 0 && y < 0){
                System.out.printf("quarto\n");
            } else if (x < 0 && y < 0){
                System.out.printf("terceiro\n");
            } else if (x < 0 && y > 0){
                System.out.printf("segundo\n");
            }
        }
    }
}
