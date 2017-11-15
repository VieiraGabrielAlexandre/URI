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
public class URI1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int opc1 = input.nextInt();
        int opc2 = input.nextInt();
        double total = 0;
                switch (opc1){
                    case 1:
                        total = 4.00;
                        break;
                    case 2: 
                        total = 4.50;
                        break;
                    case 3:
                        total = 5.00;
                        break;
                    case 4:
                        total = 2.00;
                        break;
                    case 5:
                        total = 1.50;
                        break;
                }
        System.out.printf("Total: R$ %.2f\n", total * opc2);
    }
    
}
