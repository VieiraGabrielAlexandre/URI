package uri;

/**
 *
 * @author gabriel
 */
import java.util.*;
public class URI1066 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        for (int i = 0; i < 5; i++){
            a = input.nextInt();
            if (a > 0){
                positivo++;
            }
            if (a < 0){
                negativo++;
            }
            if (a % 2 == 0){
                par++;
            } 
            else {
                impar++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);
    }
}
