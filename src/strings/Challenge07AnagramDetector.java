import java.util.HashMap;
import java.util.Map;

public class Challenge07AnagramDetector {

    static boolean isAnagram(String first, String second) {

        Map<Character, Integer> frequency =
                new HashMap<>();


        for (int i = 0; i < first.length(); i++) {

            char ch = Character.toLowerCase(first.charAt(i));

            if (!Character.isLetterOrDigit(ch)) {
                continue;
            }

            frequency.put(
                    ch,
                    frequency.getOrDefault(ch, 0) + 1
            );
        }


        for (int i = 0; i < second.length(); i++) {

            char ch = Character.toLowerCase(second.charAt(i));

            if (!Character.isLetterOrDigit(ch)) {
                continue;
            }

            if (!frequency.containsKey(ch)) {
                return false;
            }

            frequency.put(ch, frequency.get(ch) - 1);

            if (frequency.get(ch) < 0) {
                return false;
            }
        }


        for (int count : frequency.values()) {

            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(
                isAnagram("listen", "silent")
        );

        System.out.println(
                isAnagram("triangle", "integral")
        );

        System.out.println(
                isAnagram("hello", "world")
        );

        System.out.println(
                isAnagram("Debit Card", "Bad Credit")
        );
    }
}