import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        //Array
        // type?
        // array indicator
        //variable name

        String[] badHabits = new String[]{
                "ewafrawfwaefafef",
                "adsfawfawe aefawefeawfawefaewgawrgargsaergawrgar",
                "awfafaewfa"
        };

        for (int i = 0; i < badHabits.length; i++) {
            System.out.println(badHabits[i].toUpperCase());
        }


        for (String badHabit: badHabits) {
            if (badHabit.length() < 22) {
                System.out.println(badHabit);
            }
        }

        boolean hasNoshortStr = false;
        for (String badHabit: badHabits) {
            if (badHabit.length() < 22){
                hasNoshortStr = true;
            }
        }


        ArrayList<String> badHabitList = new ArrayList<>();
        badHabitList.add("awdadvcvrfhgijhiuh");
        badHabitList.add("aiwefbafbawefb");

        System.out.println(badHabitList);
        System.out.println(badHabitList.get(0));


    }
}
