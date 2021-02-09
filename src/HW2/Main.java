package HW2;

public class Main {

    public static int sumOfAllCells(String[][] arr) throws MyArraySizeException, MyArrayDataException {

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
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }




    public static void main (String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "3", "4text", "5"}, {"3", "4", "5", "6"}, {"4", "5", "6", "7"}};

        try {
            try {
                int sum = sumOfAllCells(arr);
                System.out.println("Сумма всех ячеек = " + sum);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива отличен от допустимого!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке: [" + e.i + "][" + e.j + "]. Данные отличны от Integer.");
        }


    }
}
