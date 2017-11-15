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

public class URI1035 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        if (B > C 
                && D > A 
                    && (C + D) > (A + B) 
                        && C > 0
                            &&  D > 0
                                && A % 2 == 0){
            System.out.printf("Valores aceitos\n");
        }
        else {
            System.out.printf("Valores nao aceitos\n")
        ;}
    }
}
