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
public class URI1042 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a < b && b < c && a < c){
            System.out.printf("%d\n%d\n%d\n\n", a, b, c);
            System.out.printf("%d\n%d\n%d\n", a, b, c);
        }
        if (b < a && a < c && b < c){
            System.out.printf("%d\n%d\n%d\n\n", b, a, c);
            System.out.printf("%d\n%d\n%d\n", a, b, c);
        }
        if (c < a && a < b && c < b){
            System.out.printf("%d\n%d\n%d\n\n", c, a, b);
            System.out.printf("%d\n%d\n%d\n", a, b, c);
        }
        if (a < b && a < c && c < b){
            System.out.printf("%d\n%d\n%d\n\n", a, c, b);
            System.out.printf("%d\n%d\n%d\n", a, b, c);
        }
        if (b < a && b < c && c < a){
            System.out.printf("%d\n%d\n%d\n\n", b, c, a);
            System.out.printf("%d\n%d\n%d\n", a, b, c);
        }
        if (c < b && c < b && b < a){
            System.out.printf("%d\n%d\n%d\n\n", c, b, a);
            System.out.printf("%d\n%d\n%d\n", a, b, c);
        }
    }
}
