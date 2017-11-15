package uri;

/**
 *
 * @author gabriel
 */
import java.util.*;

public class URI1064 {

    public static void main(String[] args) {
        int positivo = 0;
        double media = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            double a = input.nextDouble();     
                if (a > 0){
                   positivo ++;   
                   media = media + a;
            }
        }
        System.out.printf("%d valores positivos\n", positivo);
        System.out.printf("%.1f\n", media / positivo);
    }
}
