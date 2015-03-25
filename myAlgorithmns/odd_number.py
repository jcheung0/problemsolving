

num_array = [1,1,1,1,1,1,5,5,5,6,6,6,6,9,9,9,9,3,3]


def odd_number(num_array):
    temp = set()
    for i in num_array:
        #print num_array[i]
        if i not in temp:
            temp.add(i)
        else:
            temp.remove(i)
    return temp

def odd_number_2n(num_array):
    num_array = sorted(num_array)
    counter = 0
    previous = 0
    for i in num_array:
        if i == previous:
            counter = counter + 1
        else:
            if previous != 0 and counter % 2 == 0:
                return previous
            
            counter = 0
        previous = i

def odd_number_dic(num_array):
    pass

print odd_number(num_array)
print odd_number_2n(num_array)
#print odd_number(num_array)
