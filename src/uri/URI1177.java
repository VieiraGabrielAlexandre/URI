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

public class URI1177 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        int vetor [] = new int [1000];
        for (int i = 0, j = 0; i < 1000; i++) {
            System.out.printf("N[%d] = %d\n",i,j);
                j ++;
                if (j == valor){
                    j=0;
                }
            }
        }
    }
