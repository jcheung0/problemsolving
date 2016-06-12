class permute:

    def __init__(self):
        return 

    def permutation(self,prefix,input):
        if(len(input) == 0):
            print prefix
        else:
            for i in range(0,len(input)):
                self.permutation(prefix + input[i],input[0:i] + input[i+1:len(input)])
