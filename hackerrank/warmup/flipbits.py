num_on_inputs = input()
args = []
for i in range(0,num_on_inputs):
    num = input()
    print int(bin(num ^ 0xFFFFFFFF),2)
