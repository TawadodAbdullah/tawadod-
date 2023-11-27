public class Q5 {
    public static void main(String[] args) {
        int X = 5;
        System.out.println(sumPositiveIntegers(X));
    }

    public static int sumPositiveIntegers(int X) {
        int sum = 0;
        for (int i = 1; i <= X; i++) {
            sum += i;
        }
        return sum;
    }
}
