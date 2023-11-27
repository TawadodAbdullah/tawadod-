public class Q9{
    public static void main(String[] args) {
        String X = "Let's try, Mike!";
        System.out.println(removePunctuation(X)); // Output: Lets try Mike
    }

    public static String removePunctuation(String X) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < X.length(); i++) {
            char ch = X.charAt(i);
            if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
