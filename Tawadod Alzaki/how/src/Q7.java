public class Q7 {
    public static void main(String[] args) {
        int X = 10;
        System.out.println(sumSquarePositiveIntegers(X)); // Output: 55
    }

    public static int sumSquarePositiveIntegers(int X) {
        int sum = 0;
        for (int i = 1; i <= X; i++) {
            sum += i * i;
        }
        return sum;
    }
}
