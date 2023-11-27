public class Q1 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(isEven(number));
    }

    public static boolean isEven(int i) {
        if ((i & 1) == 0) {
            return true;
        } else {
            return false;
        }
    }
}