import java.util.HashSet;
import java.util.Set;

public class Challenge06FirstRepeating {

    static Character firstRepeating(String input) {

        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {

            char ch = Character.toLowerCase(input.charAt(i));

            if (ch == ' ') {
                continue;
            }

            if (seen.contains(ch)) {
                return ch;
            }

            seen.add(ch);
        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println(firstRepeating("abcdef"));
        System.out.println(firstRepeating("hello"));
        System.out.println(firstRepeating("programming"));
        System.out.println(firstRepeating("Java"));
    }
}