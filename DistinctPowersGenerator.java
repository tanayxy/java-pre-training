public class DistinctPowersGenerator {
    public static void main(String[] args) {

        int[] results = new int[20];
        int count = 0;

        for (int a = 2; a <= 5; a++) {

            for (int b = 2; b <= 5; b++) {

                int value = (int) Math.pow(a, b);
                boolean alreadyExists = false;

                
                for (int i = 0; i < count; i++) {
                    if (results[i] == value) {
                        alreadyExists = true;
                        break;
                    }
                }

                
                if (!alreadyExists) {
                    results[count] = value;
                    count++;
                }
            }
        }

        System.out.println("Unique powers:");

        for (int i = 0; i < count; i++) {
            System.out.println(results[i]);
        }

        System.out.println("Total unique entries: " + count);
    }
}