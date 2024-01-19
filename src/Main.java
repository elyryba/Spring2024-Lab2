import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public class PrimeChecker {
        public static boolean isPrime(int n) {
            // Check if n is less than 2, then it's not prime
            if (n < 2) {
                return false;
            }

            // Check from 2 to the square root of n
            for (int i = 2; i * i <= n; i++) {
                // If n is divisible by any number between 2 and sqrt(n), it's not prime
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    public class PrimeCheckerTest {

        @Test
        public void testIsPrime() {
            assertTrue("17 is a prime number", PrimeChecker.isPrime(17));
            assertFalse("465 is not a prime number", PrimeChecker.isPrime(465));
            assertTrue("7919 is a prime number", PrimeChecker.isPrime(7919));
            assertFalse("0 is not a prime number", PrimeChecker.isPrime(0));
            assertFalse("-17 is not a prime number", PrimeChecker.isPrime(-17));
        }
    }

    public class PrimeFactorsCalculator {

        public static List<Integer> primeFactors(int n) {
            List<Integer> factors = new ArrayList<>();

            // Divide n by 2 until it's odd
            while (n % 2 == 0) {
                factors.add(2);
                n /= 2;
            }

            // Check for odd factors
            for (int i = 3; i * i <= n; i += 2) {
                while (n % i == 0) {
                    factors.add(i);
                    n /= i;
                }
            }

            // If n is a prime number greater than 2
            if (n > 2) {
                factors.add(n);
            }

            return factors;
        }
    }

    public class PrimeFactorsCalculatorTest {

        @Test
        public void testPrimeFactors() {
            assertEquals("Prime factors of 17", Arrays.asList(), PrimeFactorsCalculator.primeFactors(17));
            assertEquals("Prime factors of 15", Arrays.asList(3, 5), PrimeFactorsCalculator.primeFactors(15));
            assertEquals("Prime factors of 6893", Arrays.asList(61, 113), PrimeFactorsCalculator.primeFactors(6893));
            assertEquals("Prime factors of 18", Arrays.asList(2, 3, 3), PrimeFactorsCalculator.primeFactors(18));
        }
    }

}