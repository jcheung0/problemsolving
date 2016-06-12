



def merge(left, right):
    result = []
    while len(left) > 0 or len(right) > 0:
        if(len(left) > 0 and len(right) > 0):
            if(left[0] <= right[0]):
                result.append(left[0])
                left = left[1:]
                print left
            else:
                result.append(right[0])
                right = right[1:]
        elif len(left) > 0:
            result.append(left[0])
            left = left[1:]
            print("left side size " + str(len(left))) 
            
        elif len(right) > 0:
            result.append(right[0])
            right = right[1:]
            print("right side size " + str(len(right))) 
    return result


def merge_sort(nums):
    
    if(len(nums) == 1):
        return nums
    
    mid = len(nums)/2
    left = merge_sort(nums[:mid])
    right = merge_sort(nums[mid:])
    return merge(left,right)



sortednums = merge_sort([15,15,15,15,30,20,10])

for x in sortednums:
    print x
