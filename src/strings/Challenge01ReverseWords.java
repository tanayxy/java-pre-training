public class Challenge01ReverseWords {

    static String reverseWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        // Traverse from right to left
        for (int i = sentence.length() - 1; i >= 0; i--) {

            if (sentence.charAt(i) != ' ') {
                word.insert(0, sentence.charAt(i));
            } else {
                if (word.length() > 0) {
                    if (result.length() > 0) {
                        result.append(" ");
                    }
                    result.append(word);
                    word.setLength(0);
                }
            }
        }

        // Add the first word
        if (word.length() > 0) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Java makes programming fun"));
        System.out.println(reverseWords("   Java   is   powerful   "));
        System.out.println(reverseWords("Java"));
        System.out.println(reverseWords(""));
    }
}