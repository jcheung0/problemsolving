#!/bin/python

import sys
t = int(raw_input().strip())

def decent_number(n):
    if(n < 3):
        return -1
    three_cnt = n//3
    five_cnt = 0
    while(three_cnt >= 0):
        rem = n - three_cnt*3
        if rem % 5 == 0:
            five_cnt = rem/5
            break
        three_cnt -= 1
    
    if three_cnt <= 0 and five_cnt == 0:
        return "-1"
    
    return "555"*three_cnt + "33333"*five_cnt

        
    
    

for a0 in xrange(t):
    n = int(raw_input().strip())
    print(decent_number(n))