public class DigitCancellingFractions {
    public static void main(String[] args) {

        for (int num = 10; num <= 99; num++) {

            for (int den = num + 1; den <= 99; den++) {

                int numTens = num / 10;
                int numUnits = num % 10;

                int denTens = den / 10;
                int denUnits = den % 10;

                
                if (numUnits == 0 || denUnits == 0) {
                    continue;
                }

                
                if (numTens == denUnits) {
                    if (num * denTens == den * numUnits) {
                        System.out.println(num + "/" + den +
                                " = " + numUnits + "/" + denTens);
                    }
                }

                
                if (numUnits == denTens) {
                    if (num * denUnits == den * numTens) {
                        System.out.println(num + "/" + den +
                                " = " + numTens + "/" + denUnits);
                    }
                }
            }
        }
    }
}