import timeit
from algorithms.sorting import sorting

arr = [2,1,4,5,3,4,6]
sorting = sorting()

start = timeit.timeit()
sorting.merge_sort(arr)
end = timeit.timeit()

print end - start
print(arr)
