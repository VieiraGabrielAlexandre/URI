package uri;

/**
 *
 * @author gabriel
 */
import java.util.*;
public class URI1013 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        
        if (A >= B && A >= C){
        System.out.printf("%d eh o maior\n", A);
        }
        if (B >= A && B >= C){
        System.out.printf("%d eh o maior\n", B);
        }
        if (C >= A && C >= B){
        System.out.printf("%d eh o maior\n", C);
        }
    }
}
