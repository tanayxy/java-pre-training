public class CommandLineOperationSwitcher {
    public static void main(String[] args) {

        double[] numbers = {20, 5, 3, 2};
        char[] operators = {'/', '+', '*'};

        double result = numbers[0];

        for (int i = 0; i < operators.length; i++) {

            switch (operators[i]) {

                case '+':
                    result = result + numbers[i + 1];
                    break;

                case '-':
                    result = result - numbers[i + 1];
                    break;

                case '*':
                    result = result * numbers[i + 1];
                    break;

                case '/':
                    if (numbers[i + 1] != 0) {
                        result = result / numbers[i + 1];
                    } else {
                        System.out.println("Error: Division by zero.");
                        return;
                    }
                    break;

                default:
                    System.out.println("Invalid operator.");
                    return;
            }
        }

        System.out.println("Result: " + result);
    }
}