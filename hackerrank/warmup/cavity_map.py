
size = input()
raw_map = [[0 for x in range(size)] for x in range(size)]
for i in range(0,size):
    line = raw_input()
    for j in range(0,size):
        raw_map[i][j] = int(line[j])

        
for i in range(0,size):
    for j in range(0,size):
        if(i == 0 or j == 0 or i == size-1 or j == size-1):
            pass
        else:
            if(raw_map[i-1][j] < int(raw_map[i][j]) and raw_map[i+1][j] < int(raw_map[i][j]) and raw_map[i][j-1] < int(raw_map[i][j]) and raw_map[i][j+1] < int(raw_map[i][j])):
                raw_map[i][j] = 'X'
         

print '\n'.join(''.join(str(cell) for cell in row) for row in raw_map) 