import java.util.Scanner;

public class Maarechet {

    public static void main(String[] args) {

        int[][] hours = new int [6][5];
        Scanner scanner = new Scanner(System.in);

        
        
        String[] x = name_subject();
        System.out.println(x[0]+x[1]);


        scanner.close();
    }

    public static String[] name_subject(){

        System.out.println("Please enter name of Teacher and subject. To end, enter - -");
        String name, subject;
        Scanner scanner = new Scanner(System.in);

        String ret[] = new String[2];
        name = scanner.next(); subject = scanner.next();
        ret[0]= name;
        ret[1]= subject;

        System.out.println();
        return (ret);
    }

}