import unittest

def is_prime_number(number):
    
    if(number == 2):
        return True
    
    if(number % 2 == 0):
        return False
    
    for i in range(2,number):
        if(number % i == 0):
            return False

    return True


for i in range(2,4000):
    if(is_prime_number(i)):
        print(str(i) + " is prime number")

class PrimeText(unittest.TestCase):

    def test(self):
        self.assertTrue(is_prime_number(3))

