import java.util.Random;
import java.util.Scanner;

public class Tirgul {

    public static void main(String[] args) {

        int x=0;
        Scanner scanner = new Scanner(System.in);
        while (x>=0) {
            System.out.printf("enter number: ");
            x = scanner.nextInt();
            //int r = (int)(Math.random()*101+1);
            int r = new Random().nextInt(100);
            System.out.println(" "+r);

            if (x>r){
                System.out.printf("%d is bigger than %d, randomly chosen%n",x,r);
            } else if(x<r) {
                System.out.printf("%d is smaller than %d, randomly chosen%n",x,r);
            } else {
                System.out.printf("%d is equal to %d, randomly chosen%n",x,r);
            }

        }

        scanner.close();


    }
}
