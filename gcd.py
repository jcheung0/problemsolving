


def euclidean_gcd(num1,num2):

    if(num2 == 0):
        return num1

    return euclidean_gcd(num2, num1%num2)


def poor_gcd(num1,num2):
    denominators = []
    if(num1 > num2):
        largest_number = num1
    else:
        largest_number = num2

    for i in range(2, largest_number):
        if(num1 % i == 0 and num2 % i == 0):
            denominators.append(i)

    denominators.sort()
    return denominators[len(denominators) - 1]

print(euclidean_gcd(54,24))

print(poor_gcd(54,24))
