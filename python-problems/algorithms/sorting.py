
class sorting:

    @staticmethod
    def insertion_sort(arr):
        for i in range(1, len(arr)):
            current_value = arr[i]
            position = i
            while position > 0 and arr[position - 1] > current_value:
                arr[position] = arr[position - 1]
                position -= 1
            arr[position] = current_value
    

    

    #@staticmethod
    def merge_sort(self,arr):
        if(len(arr) > 1):

            middle = len(arr)/2
            left = arr[:middle]
            right = arr[middle:]
        
            self.merge_sort(left)
            self.merge_sort(right)
            i=0
            j=0
            k=0
            while i < len(left) and j < len(right):
                if left[i] < right[j]:
                    arr[k] = left[i]
                    i +=1
                else:
                    arr[k] = right[j]
                    j += 1

                k += 1
            while i < len(left):
                arr[k] = left[i]
                i += 1
                k += 1

            while j < len(right):
                arr[k] = right[j]
                j += 1
                k += 1








    def __init__(self):
        pass
