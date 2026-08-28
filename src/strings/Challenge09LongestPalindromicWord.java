public class Challenge09LongestPalindromicWord {

    static String longestPalindromicWord(String sentence) {

        String longest = "";
        StringBuilder word = new StringBuilder();

        for (int i = 0; i <= sentence.length(); i++) {

            char ch;

            if (i < sentence.length()) {
                ch = sentence.charAt(i);
            } else {
                ch = ' ';
            }

            if (Character.isLetterOrDigit(ch)) {

                word.append(
                        Character.toLowerCase(ch)
                );

            } else {

                if (word.length() > 0) {

                    if (isPalindrome(word)
                            && word.length() > longest.length()) {

                        longest = word.toString();
                    }

                    word.setLength(0);
                }
            }
        }

        return longest.isEmpty() ? null : longest;
    }

    static boolean isPalindrome(StringBuilder word) {

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(
                longestPalindromicWord(
                        "madam racecar level"
                )
        );

        System.out.println(
                longestPalindromicWord(
                        "Java is fun"
                )
        );

        System.out.println(
                longestPalindromicWord(
                        "noon civic radar"
                )
        );
    }
}