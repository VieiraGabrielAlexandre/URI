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
public class URI1026 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        long num, numa, resposta;
        while (input.hasNext())
        {
            num = input.nextLong();
            numa = input.nextLong();
            resposta = num ^ numa;
            System.out.println(resposta);
        }
    }
}
