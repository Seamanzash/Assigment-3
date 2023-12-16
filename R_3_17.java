import java.util.HashSet;
import java.util.Set;

public class R_3_17 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 4, 5};

        int repeatedInteger = findRepeatedInteger(A);

        if (repeatedInteger != -1) {
            System.out.println("The repeated integer is: " + repeatedInteger);
        } else {
            System.out.println("No repetition found in the array.");
        }
    }

    public static int findRepeatedInteger(int[] A) {
        Set<Integer> visited = new HashSet<>();
        for (int num : A) {
            if (visited.contains(num)) {
                return num;
            }
            visited.add(num);
        }
        return -1;
    }
}

