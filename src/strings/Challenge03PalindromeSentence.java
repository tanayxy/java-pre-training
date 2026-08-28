public class Challenge03PalindromeSentence {

    static boolean isPalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {


            while (left < right &&
                   !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }


            while (left < right &&
                   !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }

            char leftChar = Character.toLowerCase(input.charAt(left));
            char rightChar = Character.toLowerCase(input.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Racecar"));
        System.out.println(isPalindrome("Madam, I'm Adam"));
        System.out.println(isPalindrome("Java"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}