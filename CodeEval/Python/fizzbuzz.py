

input = open("FizzBuzz.data")

def FizzBuzz(input):

    if(input % 15 == 0):
        return "FizzBuzz"

    if(input % 5 == 0):
        return "Buzz"

    if(input % 3 == 0):
        return "Fizz"

for test in input:
    nums = test.split(" ")
    for num in nums:
        print FizzBuzz(int(num))



