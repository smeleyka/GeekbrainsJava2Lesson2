/**
 * Created by smeleyka on 26.04.17.
 */
public class MainClass {
    public static void main(String[] args) {
        String[][] test = {{"23", "e3", "j3k", "34"}, {"67", "34", "434", "34"}, {"6", "77", "12", "90"}, {"23", "45", "34", "434", "43"}};

        try {
            stringToInt(test);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
    public static void stringToInt (String[][] arr) throws MyArrayDataException{
        if (arr.length!=4||arr[0].length!=4||arr[1].length!=4||arr[2].length!=4||arr[3].length!=4){
            throw new MyArrayDataException("Неверный размер массива");
        }
    }
}
