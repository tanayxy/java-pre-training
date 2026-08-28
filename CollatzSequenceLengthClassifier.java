public class CollatzSequenceLengthClassifier {
    public static void main(String[] args) {

        int maxLength = 0;
        int bestNumber = 0;

        for (int i = 1; i < 1000; i++) {

            long currentNumber = i;
            int length = 0;

            while (currentNumber != 1) {

                switch ((int)(currentNumber % 2)) {

                    case 0:
                        currentNumber = currentNumber / 2;
                        break;

                    case 1:
                        currentNumber = 3 * currentNumber + 1;
                        break;
                }

                length++;
            }

            if (length > maxLength) {
                maxLength = length;
                bestNumber = i;
            }
        }

        System.out.println("Starting number: " + bestNumber);
        System.out.println("Chain length: " + maxLength);
    }
}