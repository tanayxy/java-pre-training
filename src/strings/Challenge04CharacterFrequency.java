import java.util.LinkedHashMap;
import java.util.Map;

public class Challenge04CharacterFrequency {

    static Map<Character, Integer> characterFrequency(String input) {

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {

            char ch = Character.toLowerCase(input.charAt(i));

            // Ignore spaces
            if (ch == ' ') {
                continue;
            }

            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }

        return frequency;
    }

    public static void main(String[] args) {

        String input = "Hello World";

        Map<Character, Integer> result =
                characterFrequency(input);

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(
                    entry.getKey() + " = " + entry.getValue()
            );
        }
    }
}