public class Challenge08LongestWord {

    static String longestWord(String sentence) {

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

                word.append(ch);

            } else {

                if (word.length() > longest.length()) {
                    longest = word.toString();
                }

                word.setLength(0);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        System.out.println(
                longestWord("Java is powerful")
        );

        System.out.println(
                longestWord("I love Java")
        );

        System.out.println(
                longestWord("one two six")
        );
    }
}