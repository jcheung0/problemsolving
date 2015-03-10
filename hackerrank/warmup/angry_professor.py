number_of_cases = input()

for i in range(0,number_of_cases):
    test_case = raw_input().split(" ")
    students = raw_input().split(" ")
    num_of_students = int(test_case[0])
    requirement = int(test_case[1])
    on_time_counter = 0
    for i in range(0,num_of_students):
        if(int(students[i]) <= 0):
            on_time_counter = on_time_counter + 1
    if on_time_counter < requirement:
        print "YES"
    else:
        print "NO"