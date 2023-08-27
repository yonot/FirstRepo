import java.util.Scanner;

public class Q1_aug {

    public static void main(String[] args) {
        System.out.println("hi");
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        while (num >= 0) {
            sum = sum + num;
            count++;
            System.out.println("Please enter a number");
            num = scanner.nextInt();
        }
        if (count>0) {
            System.out.println("Average: " + sum*1.0 / count);
        } else {
            System.out.println("you haven't entered any positive numbers");
        }
        scanner.close();
        System.out.println("bye");
    }
}