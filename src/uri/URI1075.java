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
public class URI1075 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        for (int i = 0; i < 10000; i++){
            if (i % a == 2){
                System.out.printf("%d\n", i);
            }
        }
    }
}
