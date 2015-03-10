# Enter your code here. Read input from STDIN. Print output to STDOUT

import string
val = string.ascii_lowercase
d = dict.fromkeys(string.ascii_lowercase, 0)

sentence = raw_input()
sentence = sentence.replace(" ","")


for i in sentence:
    d[i.lower()] = d[i.lower()] + 1
is_pangram = True    
for i in d:
    if(d[i] == 0):
        is_pangram = False
        break

if is_pangram:
    print "pangram"
else:
    print "not pangram"
       