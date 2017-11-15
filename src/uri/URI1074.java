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

public class URI1074 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            int b = input.nextInt();
            if (b < 0 && b % 2 != 0) {
                System.out.printf("ODD NEGATIVE\n");
            }
            if (b > 0 && b % 2 != 0) {
                System.out.printf("ODD POSITIVE\n");
            }
            if (b > 0 && b % 2 == 0) {
                System.out.printf("EVEN POSITIVE\n");
            }
            if (b < 0 && b % 2 == 0) {
                System.out.printf("EVEN NEGATIVE\n");
            }
            if (b == 0){
                System.out.printf("NULL\n");
            }
        }
    }
}
