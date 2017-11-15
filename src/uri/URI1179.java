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

public class URI1179 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        int par[] = new int [5];
        int impar[] = new int [5];
        int capturapar = 0;
        int capturaimpar = 0;
        for (int i = 0; i < 15; i++){
            long captura = input.nextLong();
            if (captura % 2 == 0){
                par[capturapar] = (int)captura;
                capturapar ++;
            }
            else {
                impar[capturaimpar] = (int)captura;
                capturaimpar ++;
            }
            if (capturapar == 5){
                for (int j = 0; j < 5; j++){
                    System.out.printf("par[%d] = %d\n", j, par[j]);
                    par[j] = '\0';
                }
                capturapar = 0;
            }
            if (capturaimpar == 5){
                for (int j = 0; j < 5; j++){
                    System.out.printf("impar[%d] = %d\n", j, impar[j]);
                    impar[j] = '\0';
                }
                capturaimpar = 0;
            }
        }
        for (int j = 0; j <= 4; j++){
            if (impar[j] == '\0'){
                break;
            }
                System.out.printf("impar[%d] = %d\n", j, impar[j]);
            }
        for (int j = 0; j <= 4; j++){
            if (par[j] == '\0'){
                break;
            }
            System.out.printf("par[%d] = %d\n", j, par[j]);
        }
    }
}
