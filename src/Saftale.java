import java.util.Scanner;

public class Saftale {

    public static void main(String[] args) {

        int[][] hours = new int [6][5];
        Scanner scanner = new Scanner(System.in);

        String name, subject = "";

        String x = name_subject();
        System.out.println(x);

        /*
        while (name!="-"){

        }
        */
        scanner.close();
    }

    public static String[] name_subject(){
        String name = "A";
        System.out.println("Please enter name of Teacher and subject. To end, enter - -");
        String name;
        String subject = " ";

        name = scanner.next();
        subject = scanner.next();
        if (name=="-"){
            break;
        }



        System.out.println();
        return (name);
    };

}