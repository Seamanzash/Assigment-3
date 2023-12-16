import java.util.HashSet;
import java.util.Set;

    public class C_3_18 {
        public static void main(String[] args) {
            int[] B = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

            Set<Integer> repeatedIntegers = findRepeatedIntegers(B);

            if (!repeatedIntegers.isEmpty()) {
                System.out.println("The repeated integers are: " + repeatedIntegers);
            } else {
                System.out.println("No repetitions found in the array.");
            }
        }

        public static Set<Integer> findRepeatedIntegers(int[] B) {
            Set<Integer> visited = new HashSet<>();
            Set<Integer> repeatedIntegers = new HashSet<>();

            for (int num : B) {
                if (visited.contains(num)) {
                    repeatedIntegers.add(num);
                }
                visited.add(num);

                if (repeatedIntegers.size() == 5) {
                    return repeatedIntegers;
                }
            }

            return new HashSet<>();
        }
    }

