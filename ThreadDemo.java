package DayThree;

/**
 * Created by student on 29/06/2016.
 */
public class ThreadDemo {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();


        new ThreadTwo();
        try {
            for
                (int i = 1; i <= 11; i++)
            {
                System.out.println("Main Thread:" + i);
            Thread.sleep(1000);

        }

    } catch (InterruptedException e)

    {
        System.out.println("Main thread interupted");
    }


    System.out.println("Main thread interupted");

    }
}


class ThreadTwo implements Runnable {
    Thread t;

    ThreadTwo() {
        t = new Thread(this, "Second Thread");
        System.out.println("Another thread" + t);
        t.start();//execute run
    }


    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Another thread" + i);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            System.out.println("Second thread interrupted");
        }
        System.out.println("second thread terminated");


    }
}
