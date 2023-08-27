/*import java.util.Random;
import java.util.Scanner;

public class Task_madeup {

    public static void main(String[] args) {
        byte sum = 0;
        byte x=21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers from 10 to 20. To end enter 0");
        while (x>0) {
            System.out.println("sum is "+sum);
            x = scanner.nextByte();
            if (x!=0 && (x>20 || x<10)) {
                int rand = new Random().nextInt(10,20);
                x = (byte)rand;
                System.out.printf("wrong, %d randomly chosen instead. %n", x);
            }
            sum = sum + x;


        }

        System.out.println(sum);


        scanner.close();

    }
}
*/