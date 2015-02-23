import math 

def isPrimeNumber(n):

	if (n == 2):
		return True
		
	if (n < 2):
		return False

	if (n%2 == 0):
		return False
	result = True
	end = math.sqrt(n)
	for i in range(3,int(end),2):
		
		if ( n % i == 0):
			result = False


	return result


def createPrimeList(n):
	primeList = []
	for i in range (0,n):
		if (isPrimeNumber(i)):
			primeList.append(i)

	return primeList;


primelist = createPrimeList(1000)

for i in primelist:
	print i