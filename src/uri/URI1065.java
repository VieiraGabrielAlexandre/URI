
package uri;

/**
 *
 * @author gabriel
 */
import java.util.*;
public class URI1065 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pares = 0;
        for (int i = 0; i < 5; i++){
            int a = input.nextInt();
                if (a % 2 ==  0){
                    pares ++;
                }
        }
        System.out.printf("%d valores pares\n", pares);
    }
}
