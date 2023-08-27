import java.util.Scanner;
/* bla bla


 */
public class Prog1 {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();*/
        /*int x=100;
        String s="bad  ";
        String m="morning ";
        String msg = s+m;
        //System.out.println(s+m+msg);
        msg = String.format("%s ... %s%n", s, m);
        //System.out.println(String.format("%s ... %s"), s, m);
        System.out.println(msg);
        /*System.out.printf("%s ... %s%n", s, m);
        System.out.printf("%s ... %s%n", m, s);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first and last name, age and city");
        String first_n = scanner.next();
        String last_n = scanner.next();
        float age = scanner.nextFloat();
        String city = scanner.next();
        System.out.printf("My name is %s %s, I am %3.1f years old and I live in %s%n", first_n, last_n, age, city);
        scanner.close();
    }

}
