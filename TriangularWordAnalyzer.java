public class TriangularWordAnalyzer {
    public static void main(String[] args) {

        String[] words = {"ABC", "CAT", "DOG", "HELLO", "JAVA"};

        int count = 0;

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            int sum = 0;

            for (int j = 0; j < word.length(); j++) {
                char ch = Character.toUpperCase(word.charAt(j));
                sum += ch - 'A' + 1;
            }

            int n = 1;
            boolean isTriangular = false;

            while (n * (n + 1) / 2 <= sum) {

                int triangular = n * (n + 1) / 2;

                if (triangular == sum) {
                    isTriangular = true;
                    break;
                }

                n++;
            }

            if (isTriangular) {
                System.out.println(word + " = " + sum + " -> Triangular");
                count++;
            } else {
                System.out.println(word + " = " + sum + " -> Not Triangular");
            }
        }

        System.out.println("Total triangular words: " + count);
    }
}