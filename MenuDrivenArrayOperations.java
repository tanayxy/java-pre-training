import java.util.Scanner;

public class MenuDrivenArrayOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 25, 5, 40, 15};

        boolean running = true;

        while (running) {

            System.out.println("\n--- Array Menu ---");
            System.out.println("1. Find Minimum");
            System.out.println("2. Find Maximum");
            System.out.println("3. Reverse Array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    int min = arr[0];

                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }

                    System.out.println("Minimum: " + min);
                    break;

                case 2:
                    int max = arr[0];

                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }

                    System.out.println("Maximum: " + max);
                    break;

                case 3:
                    int left = 0;
                    int right = arr.length - 1;

                    while (left < right) {

                        int temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;

                        left++;
                        right--;
                    }

                    System.out.println("Reversed array:");

                    for (int value : arr) {
                        System.out.print(value + " ");
                    }

                    System.out.println();
                    break;

                case 4:
                    running = false;
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}