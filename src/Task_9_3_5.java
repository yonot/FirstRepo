public class Task_9_3_5 {

    public static void main(String[] args) {


// HERE GOES

        double biggest=10;


        for (int i = 0; i < 3; i++)
        {

            double new_num = (Math.random()*551+200);
            int new_int = (int) new_num;

            System.out.println(new_num);
            System.out.println(new_int);
            System.out.println();
            if (new_num>biggest)
            {
                biggest = new_int;
            }

        }

        System.out.println(biggest);

// HERE ENDS

    }
}