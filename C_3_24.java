public class C_3_24 {
        public static void main(String[] args) {
            int[][][] array1 = {
                    {{1, 2, 3}, {4, 5, 6}},
                    {{7, 8, 9}, {10, 11, 12}}
            };

            int[][][] array2 = {
                    {{13, 14, 15}, {16, 17, 18}},
                    {{19, 20, 21}, {22, 23, 24}}
            };

            int[][][] result = addArrays(array1, array2);

            // Print the result
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    for (int k = 0; k < result[i][j].length; k++) {
                        System.out.print(result[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }

        public static int[][][] addArrays(int[][][] array1, int[][][] array2) {
            int[][][] result = new int[array1.length][array1[0].length][array1[0][0].length];

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    for (int k = 0; k < array1[i][j].length; k++) {
                        result[i][j][k] = array1[i][j][k] + array2[i][j][k];
                    }
                }
            }

            return result;
        }
}


