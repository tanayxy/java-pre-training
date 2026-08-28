import java.util.LinkedHashMap;
import java.util.Map;

public class Challenge05FirstNonRepeating {

    static Character firstNonRepeating(String input) {

        Map<Character, Integer> frequency =
                new LinkedHashMap<>();


        for (int i = 0; i < input.length(); i++) {

            char ch = Character.toLowerCase(input.charAt(i));

            if (ch == ' ') {
                continue;
            }

            frequency.put(
                    ch,
                    frequency.getOrDefault(ch, 0) + 1
            );
        }


        for (char ch : frequency.keySet()) {

            if (frequency.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println(firstNonRepeating("swiss"));
        System.out.println(firstNonRepeating("programming"));
        System.out.println(firstNonRepeating("aabbcc"));
        System.out.println(firstNonRepeating("Java"));
    }
}