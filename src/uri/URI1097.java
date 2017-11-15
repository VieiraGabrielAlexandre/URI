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
public class URI1097 {
        public static void main(String[] args) {
        int fixo = 7;
        int a, j;
        for (int i = 1; i <= 9; i = i + 2){
            for (j = 1, a = fixo; j <= 3; a--, j++){
                System.out.printf("I=%d J=%d\n", i, a);
            }
            fixo = fixo + 2 ;
        }
    }
}
