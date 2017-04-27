/**
 * Created by smeleyka on 26.04.17.
 */
public class MainClass {
    public static void main(String[] args) {
        String[][] test = {{"23", "3", "35", "34"}, {"67", "34", "434", "34"}, {"6", "77", "12", "90"}, {"23", "45", "34", "56"}};
        try {
            arrayCheck(test);
            stringToInt(test);
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e1) {
            e1.printStackTrace();
        }
    }

    public static void arrayCheck(String[][] arr) throws MySizeArrayException, MyArrayDataException {
        int arrSize = 4; //размер входящего массива

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arrSize) throw new MySizeArrayException();
            else if (arr[i].length != arrSize) {
                int j = arr[i].length;
                throw new MySizeArrayException("Неверный размер входящего массива (4x4): arr[" + i + "]" + "[" + j + "]");
            }
        }
//        int[][] intArr = new int [arr.length][arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                try {
//                    intArr[i][j] = Integer.parseInt(arr[i][j]);
//                }
//                catch (NumberFormatException e){
//                    throw new MyArrayDataException();
//                }
//            }
//        }
    }

    public static void stringToInt(String[][] arr) throws MyArrayDataException {
        int arrSumm = 0;
        int[][] intArr = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    intArr[i][j] = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Недопустимое значение в ячейке: [" + i + "]" + "[" + j + "]");
                }
                arrSumm+=intArr[i][j];
            }
        }
        System.out.println(arrSumm);
    }
}
