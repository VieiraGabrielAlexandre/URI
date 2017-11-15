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
public class URI2484 {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        char esp=' ', ast='*';
        String palavra;
        palavra = input.nextLine();
        int tamanho = palavra.length();
        for(int i=1; i <= tamanho; i++){
            for(int esp_lin = tamanho - i; esp_lin > 0; esp_lin--)
                System.out.print(esp_lin);
            for(int lin=1; lin<2*i; lin++)
                System.out.print(ast);
            System.out.println("");
        }
    }
}
