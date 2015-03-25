import sys
number_of_numbers = input()

numbers = [int(num) for num in raw_input().split(" ")]

numbers = sorted(numbers)

mindiff = sys.maxint
pairs = []
for i in range(1,number_of_numbers):
    diff = numbers[i] - numbers[i-1]
    if(diff < mindiff):
        mindiff = diff
        del pairs[:]
        pairs.append((numbers[i-1],numbers[i]))
    elif(diff == mindiff):
        pairs.append((numbers[i-1], numbers[i]))

print "".join(str(x[0]) + " " + str(x[1]) + " " for x in pairs)