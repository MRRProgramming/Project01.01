import java.util.ArrayList;
import java.util.Arrays;

/**
 * Takes an int input , returning the Roman Numeral conversion as a String
 *  @version 09.30.2025
 *  @ author mradhakrishnan
 *  Flint session: https://app.flintk12.com/chats/6237e2c8-133d-40ce-9f7b-f5ea5a2f7459
 */

public class DecimalToRoman {
    public static String decimalToRoman(int num) { //largest number is 3999
        if (num > 9999) {
            System.out.println("Invalid number (Too Large).\nYou can only input a number upto 3999 into this method.");
            return "";
        }
        ArrayList<String> romanChars = new ArrayList<>
                (Arrays.asList("I", "V", "X", "L", "C", "D", "M"));
        String[] invariants = {"IV", "IX", "XL", "XC", "CD", "CM"};
        String roman = "";
        ArrayList<Integer> digits = new ArrayList<>();
        int length = 0;
        while (num != 0) {
            digits.add(num % 10);
            length += 1;
            num /= 10;
        }
        for (int i = 0; i <= length - 1; i++) { // at most i ranges from 0 to 3
            int currentDigit = digits.get(i);
            if (i < 3) {
                if (currentDigit == 0) {
                    continue;
                } else if (currentDigit <= 3) {
                    roman = romanChars.get(2 * i).repeat(currentDigit) + roman;
                } else if (currentDigit == 4) {
                    roman = invariants[2 * i] + roman;
                } else if (currentDigit == 5) {
                    roman = romanChars.get(2 * i + 1) + roman;
                } else if (currentDigit <= 8) {
                    roman = romanChars.get(2 * i + 1) + romanChars.get(2 * i).repeat(currentDigit - 5) + roman;
                } else {
                    roman = invariants[2 * i + 1] + roman;
                }
            } else if (i == 3) {
                roman = romanChars.get(2 * i).repeat(currentDigit) + roman;
            }
        }
        return roman;
    }
}