package HW2;

public class Main {

    public static int comparisonOfArrayLength (String[][] arr) throws MyArraySizeException {

        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }


            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В ячейке [" + i + "][" + j + "] данные отличные от Integer");
                    throw new MyArrayDataException();
                }
            }
        }
        return sum;
    }




    public static void main (String[] args) {

    }
}
