import java.util.Arrays;

public class C_3_23 {
        private boolean[][] meetingPairs;
        private int[] meetingCount;
        private int n;
        private int winner;

        public C_3_23(int numberOfPlayers) {
            n = numberOfPlayers;
            meetingPairs = new boolean[n + 1][n + 1]; // Add 1 to handle 1-based indexing
            meetingCount = new int[n + 1]; // Add 1 to handle 1-based indexing
            winner = -1;
        }

        public void meet(int i, int j) {
            meetingPairs[i][j] = true;
            meetingPairs[j][i] = true;
            meetingCount[i]++;
            meetingCount[j]++;

            if (meetingCount[i] == n - 1 || meetingCount[j] == n - 1) {
                declareWinner(i, j);
            }
        }

        private void declareWinner(int player1, int player2) {
            winner = (meetingCount[player1] == n - 1) ? player1 : player2;
            // You can perform any additional actions here when the winner is declared
        }

        public int getWinner() {
            return winner;
        }

        public static void main(String[] args) {
            int numberOfPlayers = 1000;
            C_3_23 game = new C_3_23(numberOfPlayers);

            // Simulate some meetings (example)
            game.meet(1, 2);
            game.meet(1, 3);
            game.meet(2, 3);
            game.meet(2, 4);

            int winner = game.getWinner();
            if (winner != -1) {
                System.out.println("Player " + winner + " is the winner!");
            } else {
                System.out.println("No winner yet.");
            }
        }
}

