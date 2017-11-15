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
public class URI1040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        if (media >= 7.0){
            System.out.printf("Media: %.1f\n", (float) media);
            System.out.printf("Aluno aprovado.\n");
        } else if (media <= 4.9){
            System.out.printf("Media: %.1f\n", (float) media);
            System.out.printf("Aluno reprovado.\n");
        } else if (media >= 5.0 && media <= 7.0){
            System.out.printf("Media: %.1f\n",(float) media);
            System.out.printf("Aluno em exame.\n");
            double exame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",(double) exame);
                if ((media + exame) / 2 > 5.0){
                    System.out.printf("Aluno aprovado.\n");
                    System.out.printf("Media final: %.1f\n", (double)(media + exame) / 2);
                } else {
                    System.out.printf("Aluno reprovado.\n");
                    System.out.printf("Media final: %.1f\n", (double)(media + exame) / 2);
                }
        }
    }
}
