//using namespace std; is
//make a decimal to roman method use mapp or while loops
import java.util.ArrayList;

/**
 * Takes a String input with different Roman Numerals seperated by spaces, returning the Decimal conversion
 *  @version 09.30.2025
 *  @ author mradhakrishnan
 *  Flint session: https://app.flintk12.com/chats/6237e2c8-133d-40ce-9f7b-f5ea5a2f7459
 */
public class RomanToDecimal {
    static String[] invariants = {"IV", "IX", "XL", "XC", "CD", "CM"};
    static int[] invariantValues = {2,2,20,20,200,200};
    public static boolean containsInvariant(String roman)   {
        for(String invariant : invariants) {
            if(roman.toUpperCase().contains(invariant)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Takes a Roman Numeral String and gives returns the decimal equivalent
     * @param roman a Roman Numeral String
     * @return int value
     */

    public static int romanToDecimal(String roman)  {
        roman = roman.toUpperCase();
        char[] romChars = {'I', 'V', 'X', 'L', 'C', 'D', 'M'}; //TODO delete
        ArrayList<Character> romanChars = new ArrayList<>();
        romanChars.add('I');
        romanChars.add('V');
        romanChars.add('X');
        romanChars.add('L');
        romanChars.add('C');
        romanChars.add('D');
        romanChars.add('M');
        int[] values = {1,5,10,50,100,500,1000};
        //method needs a decimal  tally value
        int sum = 0;
        //"XIV"
        for (int i = 0; i < roman.length(); i++)    {
            int index = romanChars.indexOf(roman.charAt(i));
            if (index == -1)
                return -1;
            sum += values[index];
        }

        /* After making sure we only have roman letters, we now have to make sure to
        Say invalid if there are letter combinations that don't exist, like ordering errors
         */
        //if (roman.charAt(0) != 'M') return -1;
        //else if ()
// print "logically incorrect"

        // Changing sum to account for Invariants
        if (containsInvariant(roman)) {
            for (String invariant : invariants) {
                if (roman.contains(invariant))  {
                    int index = -1;  // -1 "not found"
                    for (int i = 0; i < invariants.length; i++) {
                        if (invariants[i].equals(invariant)) {
                            index = i;
                            break;  // Stop searching once found
                        }
                    }
                    sum -= invariantValues[index];
                }
            }

            /*for (int i = 0; i < roman.length(); i++) {
                int index = romanChars.indexOf(roman.charAt(i));

            }

             */
        }
        return sum;
    }

    /**
     * main method for class RomanToDecimal
     * @param args command line argument
     */
    public static void main(String[] args) {
        int decimal = 0;
        for(String s : args)    {
            decimal = romanToDecimal(s);
            System.out.println("Input: " + s + " => output: " +
                    (decimal != -1 ?
                            (!s.equalsIgnoreCase(DecimalToRoman.decimalToRoman(decimal)) ? decimal + "*" : decimal)
                            : "invalid"));
            //turnery operator :   test ? if yes : if no
        }
    }
}
