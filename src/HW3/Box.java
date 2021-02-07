package HW3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box(T fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {

        float weight = 0;
        for (T fruits: fruits) weight += fruits.getWeight();
        return weight;
    }

}
