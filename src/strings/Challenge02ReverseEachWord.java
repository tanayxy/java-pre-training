public class Challenge02ReverseEachWord {

    static String reverseEachWord(String sentence) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch != ' ') {

                word.insert(0, ch);

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


        if (word.length() > 0) {
            if (result.length() > 0) {
                result.append(" ");
            }

            result.append(word);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("Java is fun"));
        System.out.println(reverseEachWord("Hello World"));
        System.out.println(reverseEachWord("Java"));
    }
}