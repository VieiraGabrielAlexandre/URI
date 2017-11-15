/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

/**
 *
 * @author Gabriel  
 */
import java.util.*;
public class URI1021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double vl = teclado.nextDouble();
        double cm, cq, vt, dz, cc, ds, um;
        double moedas, mcq, mvt, mdz, mcc, mum;
        
        moedas = vl * 100.0;
        
        cm = (int)vl/100;
        vl %= 100;
        cq = (int) (vl / 50.0);
        vl %= 50;
        vt = (int) (vl / 20.0);
        vl %= 20;
        dz = (int)(vl / 10.0);
        vl %= 10;
        cc = (int)(vl / 5.0);
        vl %= 5;
        ds = (int)(vl / 2.0);
        vl %= 2;
        um = (int)(vl / 1.0);
        vl %= 1;
       
        moedas = moedas % 100;
        
        mcq = (int)moedas / 50;
        moedas %= 50;
        mvt = (int)moedas / 25;
        moedas %= 25;
        mdz = (int)moedas / 10;
        moedas %= 10;
        mcc = (int)moedas / 5;
        moedas %= 5;
        mum = (int)moedas;
        
        System.out.println("NOTAS:");
        System.out.println((int)cm + " nota(s) de R$ 100.00");
        System.out.println((int)cq + " nota(s) de R$ 50.00");
        System.out.println((int)vt + " nota(s) de R$ 20.00");
        System.out.println((int)dz + " nota(s) de R$ 10.00");
        System.out.println((int)cc + " nota(s) de R$ 5.00");
        System.out.println((int)ds + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)um + " moeda(s) de R$ 1.00");
        System.out.println((int)mcq + " moeda(s) de R$ 0.50");
        System.out.println((int)mvt + " moeda(s) de R$ 0.25");
        System.out.println((int)mdz + " moeda(s) de R$ 0.10");
        System.out.println((int)mcc + " moeda(s) de R$ 0.05");
        System.out.println((int)mum + " moeda(s) de R$ 0.01");
    }
}
