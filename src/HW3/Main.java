package HW3;

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
        Object[] str = new Object[]{"A", "B", "C", "D", "A"};
        for (Object o : str) {
            System.out.print(o);
        }
        System.out.println();
        swappingArrayElements(str, 1, 3);
        for (Object o : str) {
            System.out.print(o);
        }
    }

}
