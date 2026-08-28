public class Challenge10RunLengthEncoding {

    static String compress(String input) {

        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i) == input.charAt(i - 1)) {

                count++;

            } else {

                result.append(input.charAt(i - 1));
                result.append(count);

                count = 1;
            }
        }

        // Add final character group
        result.append(input.charAt(input.length() - 1));
        result.append(count);

        return result.toString();
    }

    static String decompress(String input) {

        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < input.length()) {

            char ch = input.charAt(i);
            i++;

            int count = 0;


            while (i < input.length()
                    && Character.isDigit(input.charAt(i))) {

                count = count * 10
                        + (input.charAt(i) - '0');

                i++;
            }


            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String input1 = "aaabbccccd";

        String compressed = compress(input1);

        System.out.println("Original:   " + input1);
        System.out.println("Compressed: " + compressed);
        System.out.println("Decompressed: "
                + decompress(compressed));

        System.out.println();

        System.out.println(compress("abcd"));
        System.out.println(compress("aaaa"));
    }
}