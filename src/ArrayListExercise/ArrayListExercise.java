package ArrayListExercise;
import java.util.ArrayList;

public class ArrayListExercise {

    public static boolean doesArraylistContainString(ArrayList<String> listOfString, String string) {
        for (int i = 0; i < listOfString.size(); i++) {
             String firstString = listOfString.get(i);
            if (firstString.equals(string)) {
                System.out.println("The String has been found!");
                return true;
            }
        }
        listOfString.add(string);
        return false;
    }
}
