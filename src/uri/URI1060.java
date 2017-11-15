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

public class URI1060 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positivo = 0;
        for (int i = 1; i <= 6; i++) {
            double a = input.nextDouble();
            if (a >= 0) {
                positivo ++;
            }
        }
        System.out.printf("%d valores positivos\n", positivo);
    }
}
