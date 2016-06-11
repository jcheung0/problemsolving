


def fibo(num):
    if(num == 0 or num == 1):
        return 1
    
    return fibo(num-1) + fibo(num - 2)

print(fibo(10))
