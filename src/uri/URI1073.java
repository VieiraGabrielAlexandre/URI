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
public class URI1073 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int dobro;
        for (int i = 2; i <= a; i++){
            if (i % 2 == 0){
                dobro = i * i;
                System.out.printf("%d^2 = %d\n", i, dobro);
            }
        }
    }
}
