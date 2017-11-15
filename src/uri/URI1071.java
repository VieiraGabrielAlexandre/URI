package uri;

/**
 *
 * @author gabriel
 */
import java.util.*;

public class URI1071 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int soma = 0;
        int auxiliar;
        if (a > b) {
            auxiliar = a;
            a = b;
            b = auxiliar;
        }
        if (a % 2 != 0) {
            for (int x = a + 2; x < b; x++) {
                if (x % 2 != 0) {
                    soma += x;
                }
            }
        } else {
            int x;
            for (x = a + 1; x < b; x++) {
                if (x % 2 != 0) {
                    soma += x;
                }
            }
        }
        System.out.printf("%d\n", soma);
    }
}
