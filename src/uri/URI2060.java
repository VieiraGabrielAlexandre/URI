
package uri;

/**
 *
 * @author internet
 */
import java.util.*;
public class URI2060 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int mul2 = 0;
        int mul3 = 0;
        int mul4 = 0;
        int mul5 = 0;
        int a = input.nextInt();
        for (int i = 0; i < a; i++){
            int b = input.nextInt();
            if (b % 2 == 0){
                mul2++;
            }
            if (b % 3 == 0){
                mul3++;
            }
            if (b % 4 == 0){
                mul4++;
            }
            if (b % 5 == 0){
                mul5++;
            }
        }
        System.out.printf("%d Multiplo(s) de 2\n", mul2);
        System.out.printf("%d Multiplo(s) de 3\n", mul3);
        System.out.printf("%d Multiplo(s) de 4\n", mul4);
        System.out.printf("%d Multiplo(s) de 5\n", mul5);
    }
}
