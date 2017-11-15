package uri;

/**
 *
 * @author gabriel
 */
import java.util.*;

public class URI1165 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            int b = input.nextInt();
            boolean primos = true;
            for (int j = 2; j < b; j++) {
                if (b % j == 0) {
                    primos = false;
                }
            }
            if (primos) {
                System.out.printf("%d eh primo\n", b);
            } else {
                System.out.printf("%d nao eh primo\n", b);
            }
        }
    }

}
