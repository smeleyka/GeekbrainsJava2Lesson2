/**
 * Created by smeleyka on 26.04.17.
 */
public class MainClass {
    public static void main(String[] args) {
        String[][] test = {{"23", "e3", "j3k", "34"}, {"67", "34", "434", "34"}, {"6", "77", "12", "90"}, {"23", "45", "34", "434"}};

        try {
            arrayCheck(test);
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        }
    }
    public static void arrayCheck (String[][] arr) throws MySizeArrayException{
        int arrSize = 4; //размер входящего массива
        int arrSumm =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length!=arrSize) throw new MySizeArrayException();
            else if (arr[i].length!=arrSize) {
                int j = arr[i].length;
                throw new MySizeArrayException("Неверный размер входящего массива (4x4): arr["+i+"]"+"["+j+"]");
            }
        }
    }

    public static void stringToInt (String[][]arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrSumm += Integer.parseInt(arr[i][j]);
            }
        }
    }
}
