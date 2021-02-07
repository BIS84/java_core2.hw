package HW3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public float getWeight() {

        float weight = 0;
        for (T fruits: fruits) weight += fruits.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void pourFruit(Box<T> box) {

        // Запутался и не сделал

//        if(this.getWeightFruits() == box.getWeightFruits()) {

//            this.addAll(box);
//             this.clear();
//       }
//        } else {
//            System.out.println("It was not possible to pour the fruit. The boxes contain different types of fruits.");
//        }
    }


}
