/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

/**
 *
 * @author Gabriel
 */
import java.util.*;
public class URI2174 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int impares = 0;
        for (int i = a; impares < 6; i++){
            if (i % 2 == 1){
                impares ++;
                System.out.printf("%d\n", i);
            }
        }
    }
}
