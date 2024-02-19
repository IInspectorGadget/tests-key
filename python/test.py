import unittest
from isPrime import isPrime 

class TestIsPrime(unittest.TestCase):
    def testNonPrimeNumber(self):
        self.assertFalse(isPrime(0))
        self.assertFalse(isPrime(1))
        self.assertFalse(isPrime(4))
        self.assertFalse(isPrime(10))

    def testPrimeNumber(self):
        self.assertTrue(isPrime(2))
        self.assertTrue(isPrime(3))
        self.assertTrue(isPrime(5))
        self.assertTrue(isPrime(7))
        self.assertTrue(isPrime(11))

if __name__ == '__main__':
    unittest.main()