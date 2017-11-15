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
import java.util.*;
public class URI1051 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double salario = input.nextDouble();
        double auxiliar;
        double taxa;
        if (salario < 2000.00){
            System.out.printf("Isento\n");
        }
        else {
            if (salario > 2000.00 && salario <= 3000.00){
                auxiliar = salario - 2000.00;
                taxa = (auxiliar / 100.00) * 8.00;
                System.out.printf("R$ %.2f\n", taxa);
            }
            else if (salario > 3000.00 && salario <= 4500.00){
                auxiliar = salario - 3000.00;
                taxa = (auxiliar / 100.00 * 18.00) + 80.00;
                System.out.printf("R$ %.2f\n", taxa);
            } 
            else if (salario > 4500.00){
                auxiliar = salario - 4500.00;
                taxa = auxiliar / 100.00 * 28.00 + 350.00;
                System.out.printf("R$ %.2f\n", taxa);
            }            
        }
    }
}
