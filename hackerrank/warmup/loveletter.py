def isPalindrome(string):
    isPalindrome = True
    for i in range(0,(len(string)/2) + 1):
        if(string[i] != string[-i-1]):
            isPalindrome = False
            break
    return isPalindrome

def formPalindrome(string):
    count = 0
    if(isPalindrome(string)):
        return 0
    else:
        for i in range(0,(len(string)/2) + 1):
            if(string[i] != string[-i-1]):
                start = string[i]
                end = string[-i-1]
                while(end != 'a'):
                    end = chr(ord(end) -1)
                    count = count + 1
                    if(end == start):
                        string[-i-1] = end
                        break;
        print string
        return count

a = raw_input()

print formPalindrome(a)
