public class Q3{
    public static void main(String[] args) {
        long X = 7;
        long Y= 4;
        System.out.println(isMultiple(X, Y));
    }

    public static boolean isMultiple(long X, long Y) {
        if (Y != 0 && X % Y == 0) {
            return true;
        } else {
            return false;
        }
    }
}
