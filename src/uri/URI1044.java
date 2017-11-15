
package uri;

/**
 *
 * @author Desktop
 */
import java.util.*;
public class URI1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a % b == 0 || b % a == 0){
            System.out.printf("Sao Multiplos\n");
        } else {
            System.out.printf("Nao sao Multiplos\n");
        }
    }
}
