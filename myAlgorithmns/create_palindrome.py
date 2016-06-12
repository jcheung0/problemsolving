
def can_i_create_palindrome(str):
    char_map = {}
    for i in str:
        if i in char_map:
            char_map[i.lower()] = char_map[i.lower()] + 1
        else:
            char_map[i.lower()] = 1
    odd_counter = 0
    for key in char_map:
        if(char_map[key] % 2 != 0):
            odd_counter = odd_counter + 1

    if(odd_counter > 1):
        return False
    else:
        return True

def isPalindrome(str):
    
    for i in range(0,len(str)/2):
        if(str[i].lower() != str[len(str)-i-1].lower()):
            return False

    return True

def recursive_palindrome_checker(str):
    words = [str]
    if len(str) == 1:
        return str
    else:
        for i in str
        

print can_i_create_palindrome("kayak")

print isPalindrome("Kayak")
