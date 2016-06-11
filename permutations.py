def permute(s):
    res = [];
    if len(s) == 1:
        res = [s]
        print res
    else:
        for i,c in enumerate(s):
            print i
            print c
            for perm in permute(s[:i] + s[i+1:]):
                res += [c + perm]
                #print res
    return res


s = raw_input()


test_array = ["test","test2","test3"]

test_dict = {"test":"foo"}

test_tup = [('1','test'),("2","foo")]


for i,c in test_tup:
    print i
    print c 

#for i,c in enumerate(test_array):
#    print c

#print enumerate(s)
#for i in permute(s):
    #print i
#    pass
    #print i
    


