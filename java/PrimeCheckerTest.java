import org.junit.Assert;
import org.junit.Test;
public class PrimeCheckerTest {
    @Test
    public  void testPrimeNumber(){
        Assert.assertTrue(PrimeChecker.isPrime(2));
        Assert.assertTrue(PrimeChecker.isPrime(3));
        Assert.assertTrue(PrimeChecker.isPrime(5));
        Assert.assertTrue(PrimeChecker.isPrime(7));
        Assert.assertTrue(PrimeChecker.isPrime(11));
    }
    @Test
    public void testNonPrimeNumber() {
        Assert.assertFalse(PrimeChecker.isPrime(0));
        Assert.assertFalse(PrimeChecker.isPrime(1));
        Assert.assertFalse(PrimeChecker.isPrime(4));
        Assert.assertFalse(PrimeChecker.isPrime(10));
    }
}