import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class C_3_21 {
        public static void main(String[] args) {
            Random r = new Random();
            int[] A = new int[100];

            // Generate the array A
            for (int i = 0; i < 100; i++) {
                A[i] = r.nextInt(10);
            }

            int mostFrequentValue = findMostFrequentValue(A);
            double probability = calculateProbability(A, mostFrequentValue);

            System.out.println("Most frequent value: " + mostFrequentValue);
            System.out.println("Probability: " + probability);
        }

        public static int findMostFrequentValue(int[] A) {
            Map<Integer, Integer> countMap = new HashMap<>();

            // Count the occurrences of each value in A
            for (int num : A) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            int mostFrequentValue = -1;
            int maxCount = 0;

            // Find the value with the highest count
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int value = entry.getKey();
                int count = entry.getValue();

                if (count > maxCount) {
                    maxCount = count;
                    mostFrequentValue = value;
                }
            }

            return mostFrequentValue;
        }

        public static double calculateProbability(int[] A, int value) {
            int count = 0;

            // Count the occurrences of the value in A
            for (int num : A) {
                if (num == value) {
                    count++;
                }
            }

            double probability = (double) count / A.length;
            return probability;
        }
}



