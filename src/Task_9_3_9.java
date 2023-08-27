import java.util.Random;

public class Task_9_3_9 {

    public static void main(String[] args) {


        for (int i = 0; i < 1; i++) {

            double rad = new Random().nextFloat();
            System.out.println(rad);
            rad = (int) (rad*70+30);
            System.out.println(rad);


            //String s1 = String.format(" %2.5f ",rad);

            float p = (float) (2*rad*Math.PI);
            System.out.println("perimeter is "+p);

            float s = (float) (Math.pow(rad,2)*Math.PI);
            System.out.println("area is "+s);

            //System.out.printf("For r=%f, the perimeter is ",rad);
        }


    }
}
