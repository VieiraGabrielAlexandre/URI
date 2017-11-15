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
public class URI1114 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tentativa = input.nextInt();
        while (tentativa != 2002){
            System.out.printf("Senha Invalida\n");
            tentativa = input.nextInt();
        }   System.out.printf("Acesso Permitido\n");
    }
}
