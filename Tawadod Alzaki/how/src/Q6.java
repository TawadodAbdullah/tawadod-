public class Q6 {
    public static void main(String[] args) {
        int X = 10;
        System.out.println(sumOddPositiveIntegers(X));
    }

    public static int sumOddPositiveIntegers(int X) {
        int sum = 0;
        for (int i = 1; i <= X; i += 2) {
            sum += i;
        }
        return sum;
    }
}
