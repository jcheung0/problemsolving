
def isPalindrome(value):
    numberVals = {};
    
   
    for i in value:
        temp = numberVals.get(i)
        if temp:
            numberVals[i] = numberVals[i] + 1
        else:
            numberVals[i] = 1
    for i in numberVals:
        print str(i) + ':' + str(numberVals[i])


isPalindrome("hello")
