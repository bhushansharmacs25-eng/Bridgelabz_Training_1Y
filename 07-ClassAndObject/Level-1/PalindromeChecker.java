public class PalindromeChecker {

    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean checkPalindrome() {
        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }

        if (text.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    void displayResult() {
        if (checkPalindrome()) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("madam");
        p.displayResult();
    }
}