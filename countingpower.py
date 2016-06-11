
def powers(list):
    count = 1
    numlist = []
    index = 0
    for i in list:
        print i
        numlist = numlist + powers(list[index+1:len(list)-1])
        for j in numlist:
            print j
        
        index = index + 1
    return numlist



powers([1,2,3])
