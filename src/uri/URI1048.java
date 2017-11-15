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
public class URI1048 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double salario = input.nextDouble();
        double reajuste15 = (salario / 100) * 15;
        double reajuste12 = (salario / 100) * 12;
        double reajuste10 = (salario / 100) * 10;
        double reajuste7 = (salario / 100) * 7;
        double reajuste4 = (salario / 100) * 4;
        if (salario >= 0 && salario <= 400.00){
            salario = salario + reajuste15;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste15);
            System.out.printf("Em percentual: 15 %%\n");
        }
        else if (salario >= 400.01 && salario <= 800.00){
            salario = salario + reajuste12;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste12);
            System.out.printf("Em percentual: 12 %%\n");
        }
        if (salario >= 800.01 && salario <= 1200.00){
            System.out.printf("Novo salario: %.2f\n", salario + reajuste10);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste10);
            System.out.printf("Em percentual: 10 %%\n");    
        }
        if (salario >= 1200.01 && salario <= 2000.00){
            System.out.printf("Novo salario: %.2f\n", salario + reajuste7);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste7);
            System.out.printf("Em percentual: 7 %%\n");            
        }
        if (salario >= 2000.01){
            System.out.printf("Novo salario: %.2f\n", salario + reajuste4);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste4);
            System.out.printf("Em percentual: 4 %%\n");             
        }
    }
}
