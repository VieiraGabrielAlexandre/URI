
package uri;

/**
 *
 * @author gabriel
 */
import java.util.*;
public class URI1070 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int impar = 0;
        for (int i = a; impar < 6; i++){
            if (i % 2 == 1){
                impar ++;
                System.out.printf("%d\n", i);
            }
        }
    }
}
