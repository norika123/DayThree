package DayThree.FactoryPattern;

/**
 * Created by student on 29/06/2016.
 */
public class Husky extends Dog implements Robotic {
    @Override
    public void Speak() {
        System.out.println("Husky say I am handsome");
    }

    @Override
    public void trackObject() {

    }

    @Override
    public void remoteControl() {

    }
}
