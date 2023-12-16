//Random Array Removal
import java.util.Random;

public class R_3_2 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        shuffleArray(array);
        removeRandomEntries(array);
    }

    public static void removeRandomEntries(Object[] array) {
        Random random = new Random();
        int length = array.length;

        while (length > 0) {
            int randomIndex = random.nextInt(length);
            System.out.println("Removed: " + array[randomIndex]);


            array[randomIndex] = array[length - 1];
            length--;
        }
    }

    public static void shuffleArray(Object[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);


            Object temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
