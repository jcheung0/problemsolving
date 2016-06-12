
class merge_sort:
    def __init__(self):
        return
    
    def merge(self,left,right):
        
        return
    def sort(self,nums):
        left = []
        right = []
        if isinstance(nums,list):
            if((nums is not None) and (len(nums) > 0)):
                middle = len(nums)/2
                for i in range(0,middle):
                    left.append(nums[i])

                for j in range(middle,len(nums)-1):
                    right.append(nums[j])

                left = self.sort(left)
                right = self.sort(right)

                return self.merge(left,right)


        else:
            print "not a list"

