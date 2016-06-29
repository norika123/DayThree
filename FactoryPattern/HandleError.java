package DayThree.FactoryPattern;

import java.util.Random;

/**
 * Created by student on 29/06/2016.
 */
public class HandleError {

    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {

            try {

                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);


            } catch (ArithmeticException e) {
                a = 0;
                System.out.println("Exception :" + e);
                {


                    System.out.println("a: " + a);
                }
            }

        }
    }
}