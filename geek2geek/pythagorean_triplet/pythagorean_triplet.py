


def is_pythagorean_triplet(numbers):
    
    for i in range(0,len(numbers)):
        numbers[i] = numbers[i] * numbers[i]
    numbers.sort()
    print(numbers)
    for num in range(len(numbers) - 1, 2, -1):
        l = 0
        r = num - 1
        while(l < r):
            print(num)
            print(r)

            if(numbers[l] + numbers[r] == numbers[num]):
                return True

            if(numbers[l] + numbers[r] < numbers[num]):
                l += 1
            else:
                r -= 1

    return False



arr = [3, 1, 4, 6, 5]
arr = [10, 4, 6, 12, 5]
print(is_pythagorean_triplet(arr))

#for i in range(0,100):
#    print("hello")
