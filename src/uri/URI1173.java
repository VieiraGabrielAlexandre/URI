/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

/**
 *
 * @author internet
 */
import java.util.Scanner;
public interface URI1173 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int vetor [] = new int [10];
        int v = input.nextInt();
        for (int i = 0; i < 10; i ++){
            vetor [i] = v;
            System.out.printf("N[%d] = %d\n",i ,v);
            v = v * 2;
        }
    }
}
