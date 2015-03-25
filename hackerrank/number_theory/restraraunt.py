# Enter your code here. Read input from STDIN. Print output to STDOUT
num_of_cases = input()

def gcd(a,b):
    while (b != 0):
        c = a
        a = b
        b = c % a
    return a

for i in range (0,num_of_cases):
    l,b = [int(token) for token in raw_input().split()]
    size = l*b
    factor = gcd(l,b)
    print (1*l*b)/(1*factor*factor)