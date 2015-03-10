import sys
#test_cases = open( sys.argv[1], 'r')
#for test in test_cases:


#test_cases.close()


def isPrime(num):
    
    if(num%2 == 0):
        return False

    if(num%3 == 0):
        return False

    return True

def sumOfPrimes():
    count = 0
    numbers = 0
    step = 1
    while(numbers < 1001):
        if(isPrime(step)):
            count = count+step
            print count
            numbers=numbers+1
        step=step+2
    return count

print sumOfPrimes()
