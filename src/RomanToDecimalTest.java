import static org.junit.Assert.*;

/**
 * JUnit4 test class for RomanTODecimal
 * @author mradhakrishnan
 * @version 09.30.2025
 */
public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        //18 of these
        assertEquals(RomanToDecimal.romanToDecimal("I"), 1);
        assertEquals(RomanToDecimal.romanToDecimal("IV"), 4);
        assertEquals(RomanToDecimal.romanToDecimal("C"), 100);
        assertEquals(RomanToDecimal.romanToDecimal("IIIIX"), 12);
        assertEquals(RomanToDecimal.romanToDecimal("iyf;yf"), -1);
        assertEquals(RomanToDecimal.romanToDecimal(""), 0);
        assertEquals(RomanToDecimal.romanToDecimal("CVXIIIXXIXIIXIIXIXIIXI"), 195);
        assertEquals(RomanToDecimal.romanToDecimal("XXIV"), 24);
        assertEquals(RomanToDecimal.romanToDecimal("filler"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("MMMDCCCLXXXVIII"), 3888);
        assertEquals(RomanToDecimal.romanToDecimal("  345345   25  2536 256 &&%$$(#"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("    in  ijj 78IIICCXVL"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("CCCIX"), 309);
        assertEquals(RomanToDecimal.romanToDecimal("XXXIX"), 39);
        assertEquals(RomanToDecimal.romanToDecimal(""), 0);
        assertEquals(RomanToDecimal.romanToDecimal("ICCV"), 206);
        assertEquals(RomanToDecimal.romanToDecimal("XXXXXXXXXX"), 100);
        assertEquals(RomanToDecimal.romanToDecimal("Iv"), 4);
        //2 of these
        assertNotEquals(RomanToDecimal.romanToDecimal("IV"), 6);
        assertNotEquals(RomanToDecimal.romanToDecimal("-I"), 1);
    }
}