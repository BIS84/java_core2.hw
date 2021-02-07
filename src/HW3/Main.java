package HW3;

import static java.awt.Color.orange;

public class Main {

    public static void swappingArrayElements(Object[] arr, int index1, int index2) {

            try {
            Object tmp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = tmp;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива.");
        }
    }



    public static void main(String[] args) {

        System.out.println("swappingArrayElements");
        Object[] str = new Object[]{"A", "B", "C", "D", "A", 2, 4};
        for (Object o : str) {
            System.out.print(o + " ");
        }
        System.out.println();
        swappingArrayElements(str, 1, 5);
        for (Object o : str) {
            System.out.print(o + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("getWeight and compare");
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();

        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        Apple apple9 = new Apple();
        Apple apple10 = new Apple();
        Apple apple11 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> boxApple1 = new Box<>(apple1, apple2, apple3);
        Box<Apple> boxApple2 = new Box<>(apple4, apple5, apple6);
        Box<Apple> boxApple3 = new Box<>(apple7, apple8, apple9, apple10, apple11);
        Box<Orange> boxOrange1 = new Box<>(orange1, orange2);

        System.out.println(boxApple2.compare(boxApple3));
        System.out.println(boxApple1.compare(boxOrange1));

        System.out.println();
        System.out.println("pourFruit");
        boxApple1.pourFruit(boxApple2);

    }
}
