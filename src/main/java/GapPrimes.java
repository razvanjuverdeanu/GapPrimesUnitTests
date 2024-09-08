import java.util.ArrayList;
import java.util.List;

public class GapPrimes {

    public static void gapPrimeNumber(int gap, int start, int end) {
        List<Integer> primes = new ArrayList<>();
        if (end - start >= gap) {
            int loop = end - start - gap;
            for (int i = 0; i <= loop; i++) {

                boolean firstPrime = true;
                int middleOfFirst = start / 2;
                for (int j = 2; j <= middleOfFirst; j++) {
                    if (start % j == 0) {
                        firstPrime = false;
                        break;
                    }
                }
                if (firstPrime) {
                    end = start + gap;
                    boolean secondPrime = true;
                    int middleOfSecond = end / 2;
                    for (int k = 2; k <= middleOfSecond; k++) {
                        if (end % k == 0) {
                            secondPrime = false;
                            break;
                        }
                    }
                    if (secondPrime) {
                        primes.add(start);
                        primes.add(end);
                        System.out.println(primes);
                        break;
                    }
                }
                start += 1;
            }

        } else {
            System.out.println("no pair of prime numbers with a gap of " + gap);
        }
    }

    public static void main(String[] args) {
        gapPrimeNumber(4, 130, 200);
    }
}
