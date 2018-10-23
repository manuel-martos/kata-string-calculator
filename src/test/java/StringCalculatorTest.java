import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://github.com/xpeppers/string-calculator-kata

public class StringCalculatorTest {

    /**
     * Step 1: the simplest thing
     * <p>
     * Create a simple String calculator with a method int add(String numbers).
     * <p>
     * * The string argument can contain 0, 1 or 2 numbers, and will return their sum (for an empty string it will
     * return 0) for example "" or "1" or "1,2".
     * <p>
     * * Start with the simplest test case of an empty string and move to 1 and two numbers.
     * <p>
     * * Remember to solve things as simply as possible so that you force yourself to write tests you did not think
     * about.
     * <p>
     * * Remember to refactor after each passing test.
     */

    @Test
    public void when_calling_add_with_empty_string_should_return_zero() {
        // Given
        StringCalculator stringCalculator = new StringCalculator();

        // When / Then
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void when_calling_add_with_one_number_string_should_return_that_number() {
        // Given
        StringCalculator stringCalculator = new StringCalculator();

        // When / Then
        assertEquals(25, stringCalculator.add("25"));
    }

    @Test
    public void when_calling_add_with_two_comma_separated_numbers_should_return_sum_of_both() {
        // Given
        StringCalculator stringCalculator = new StringCalculator();

        // When / Then
        assertEquals(75, stringCalculator.add("17,58"));
    }

    /**
     * Step 2: handle an unknown amount of numbers
     * <p>
     * Allow the add() method to handle an unknown amount of numbers.
     */

    @Test
    public void when_calling_add_with_many_comma_separated_numbers_should_return_sum_of_them() {
        // Given
        StringCalculator stringCalculator = new StringCalculator();

        // When / Then
        assertEquals(87, stringCalculator.add("17,58,12"));
        assertEquals(32, stringCalculator.add("1,2,3,5,8,13"));
    }

    /**
     * Step 3: handle new lines between numbers
     * <p>
     * Allow the add() method to handle new lines between numbers (instead of commas).
     * <p>
     * * the following input is ok: "1\n2,3" (will equal 6)
     * <p>
     * * the following input is NOT ok: "1,\n" (not need to prove it - just clarifying)
     **/


    /**
     * Step 4: support different delimiters
     * <p>
     * Support different delimiters: to change a delimiter, the beginning of the string will contain a separate line
     * that looks like this:
     * <p>
     * "//[delimiter]\n[numbers...]"
     * <p>
     * For example "//;\n1;2" should return 3 where the default delimiter is ';'.
     * <p>
     * The first line is optional. All existing scenarios should still be supported.
     **/


    /**
     * Step 5: negative numbers
     * <p>
     * Calling add() with a negative number will throw an exception "negatives not allowed" - and the negative that
     * was passed.
     * <p>
     * For example add("1,4,-1") should throw an exception with the message "negatives not allowed: -1".
     * <p>
     * If there are multiple negatives, show all of them in the exception message.
     **/


    /**
     * Step 6: ignore big numbers
     * <p>
     * Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
     */

}