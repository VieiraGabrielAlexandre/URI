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

public class URI1078 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int tabuada;
        for (int i = 1; i <= 10; i++) {
            tabuada = i * a;
            System.out.printf("%d x %d = %d\n", i, a, tabuada);
        }

    }
}
