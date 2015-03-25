# Enter your code here. Read input from STDIN. Print output to STDOUT
def calculate_symmetric_point(px,py, qx,qy):
    x=2*qx-px;
    y=2*qy-py;
    print str(x) + " " + str(y)

num_of_test_cases = input()


for i in range(0,num_of_test_cases):
    numbers = raw_input().split(" ")
    px = int(numbers[0])
    py = int(numbers[1])
    qx = int(numbers[2])
    qy = int(numbers[3])
    calculate_symmetric_point(px,py,qx,qy)