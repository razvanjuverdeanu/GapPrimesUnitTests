import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GapPrimesTest {
    @Test
    void gapForOneDigitPositiveNumbers() {
        var gapPrimes = new GapPrimes();
        List<Integer> numbers = gapPrimes.gapPrimeNumbers(2, 5, 9);
        assertEquals(List.of(5, 7), numbers);
    }

    @Test
    void gapForTwoDigitPositiveNumbers() {
        var gapPrimes = new GapPrimes();
        List<Integer> numbers = gapPrimes.gapPrimeNumbers(4, 11, 20);
        assertEquals(List.of(13, 17), numbers);
    }

    @Test
    void gapForThreeDigitPositiveNumbers() {
        var gapPrimes = new GapPrimes();
        List<Integer> numbers = gapPrimes.gapPrimeNumbers(4, 130, 200);
        assertEquals(List.of(163, 167), numbers);
    }

    @Test
    void noPrimeNumbersWithGivenGap() {
        var gapPrimes = new GapPrimes();
        List<Integer> numbers = gapPrimes.gapPrimeNumbers(3, 3, 9);
        assertEquals(List.of(), numbers);
    }

    @Test
    void gapBiggerThanDifferenceOfPositiveNumbersPair() {
        var gapPrimes = new GapPrimes();
        List<Integer> numbers = gapPrimes.gapPrimeNumbers(2, 5, 6);
        assertTrue(numbers.isEmpty());
    }

    @Test
    void negativeFirstNumber() {
        var gapPrimes = new GapPrimes();
        List<Integer> numbers = gapPrimes.gapPrimeNumbers(2, -5, 10);
        assertTrue(numbers.isEmpty());
    }

    @Test
    void negativeSecondNumber() {
        var gapPrimes = new GapPrimes();
        List<Integer> numbers = gapPrimes.gapPrimeNumbers(2, 3, -10);
        assertTrue(numbers.isEmpty());
    }

    @Test
    void gapSmallerThanTwoForOneDigitPositiveNumbers() {
        var gapPrimes = new GapPrimes();
        List<Integer> numbers = gapPrimes.gapPrimeNumbers(1, 3, 9);
        assertEquals(List.of(), numbers);
    }

}