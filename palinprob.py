
def can_form_palindrom(val):
    
    if(len(val) <= 1):
        return val
    else:
        l = []
        for i in range(len(val)):
            x = val[i]
            xs = val[:i] + val[i+1:]
            for p in can_form_palindrom(xs):
                print x
                print p
                l.append(x + p)
        return l
print "hello"
can_form_palindrom("test")
