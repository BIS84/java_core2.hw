package HW2;

public class Main {

    public static void comparisonOfArrayLength (String[][] arr) throws MyArraySizeException {

        if (arr.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
    }

    public static void main (String[] args) {

    }
}
