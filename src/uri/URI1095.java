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
public class URI1095 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1, j = 60; j >= 0; i = i + 3, j = j - 5){
            System.out.printf("I=%d J=%d\n", i, j);
        }
    }
}
