public class PalindromCheckerApp {

    public static void main(String[] args) {

        String input = "madam";
        int length = input.length();
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1)) {
                System.out.println("Not a Palindrome");
                isPalindrome = false;
            }
            length--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
