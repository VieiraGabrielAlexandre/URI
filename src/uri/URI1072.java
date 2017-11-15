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
import java.util.Scanner;
public class URI1072 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int interD = 0;
        int interF = 0;
        for (int i = 0; i < a; i++){
            int b = input.nextInt();
            if (b >= 10 && b <= 20){
                interD ++;
            } else {
                interF ++;
            }
        }
        System.out.printf("%d in\n", interD);
        System.out.printf("%d out\n", interF);
    }
}
