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
public class URI1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int vl = teclado.nextInt();
        System.out.printf("%d\n", vl);
        int cm, cq, vt, dz, cc, ds, um;
        cm = vl/100;
        vl = vl - (cm * 100);
        cq = ((vl % 100) / 50);
        vl = vl - (cq * 50);
        vt = ((vl % 50) / 20);
        vl = vl - (vt * 20);
        dz = ((vl % 20) / 10);
        vl = vl - (dz * 10);
        cc = ((vl % 10) / 5);
        vl = vl - (cc * 5);
        ds = ((vl % 5) / 2);
        vl = vl - (ds * 2);
        um = (vl % 2);
        System.out.printf("%d nota(s) de R$ 100,00\n", cm);
        System.out.printf("%d nota(s) de R$ 50,00\n", cq);
        System.out.printf("%d nota(s) de R$ 20,00\n", vt);
        System.out.printf("%d nota(s) de R$ 10,00\n", dz);
        System.out.printf("%d nota(s) de R$ 5,00\n", cc);
        System.out.printf("%d nota(s) de R$ 2,00\n", ds);
        System.out.printf("%d nota(s) de R$ 1,00\n", um);
    }
}
