import java.util.Random;

public class C_3_22 {
        public static void main(String[] args) {
            int[] A = {1, 2, 3, 4, 5};
            shuffle(A);
            for (int num : A) {
                System.out.print(num + " ");
            }
        }

        public static void shuffle(int[] A) {
            Random rand = new Random();

            for (int i = A.length - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);

                // Swap A[i] with A[j]
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
}

