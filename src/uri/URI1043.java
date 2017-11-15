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
public class URI1043 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        if (( b - c) < a && a < ( b + c) 
                && (a - c) < b && b <(a + c) &&(a -b) < c && c < (a + b))
        {
            double peri = a + b + c ;
            System.out.printf ("Perimetro = %.1f\n",peri);
        } else {
            double peri = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", peri);
        }
    
    }       
}
  
