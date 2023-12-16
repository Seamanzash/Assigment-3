//Score board
import java.util.PriorityQueue;
public class C_3_19 {
        private PriorityQueue<GameEntry> board;
        private int numEntries;

        public C_3_19(int capacity) {
            board = new PriorityQueue<>(capacity);
            numEntries = 0;
        }

        public void add(GameEntry e) {
            if (numEntries < board.size() || e.getScore() > board.peek().getScore()) {
                if (numEntries >= board.size())
                    board.poll(); // Remove the lowest score if the board is full
                board.offer(e); // Add the new entry
                numEntries++;
            }
        }

        public GameEntry remove(int i) throws IndexOutOfBoundsException {
            if (i < 0 || i >= numEntries)
                throw new IndexOutOfBoundsException("Invalid index: " + i);

            PriorityQueue<GameEntry> temp = new PriorityQueue<>(board);
            GameEntry removedEntry = null;
            for (int j = 0; j <= i; j++) {
                removedEntry = temp.poll();
            }
            board = new PriorityQueue<>(temp);
            numEntries--;
            return removedEntry;
        }
}

