public class Q2 {
    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[5];
        A[4] = new GameEntry("Player 1", 500);  // Setting score to 500

        GameEntry[] B = A.clone();
        A[4].setScore(550);  // Modifying the score in A

        System.out.println(B[4].getScore());  // Output: 500
    }
}

class GameEntry {
    private String playerName;
    private int score;

    public GameEntry(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}