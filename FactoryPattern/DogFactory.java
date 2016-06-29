package DayThree.FactoryPattern;

import DayThree.DogBreed;

//import static DayThree.DogBreed.HUSKY;
//import static DayThree.DogBreed.LABRADOR;

/**
 * Created by student on 29/06/2016.
 */
public class DogFactory {

    public static Dog makeDog(DogBreed breed){
        Dog dog = null;

        switch(breed)
        {
            case HUSKY:
                dog = new Husky();
                break;

            case  LABRADOR:
            dog  = new Labrador();
                break;
        }
        return dog;

    }
}
