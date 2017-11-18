# http://www.geeksforgeeks.org/quick-sort/

def partition(arr, low, high):
  i = low - 1
  pivot = arr[high]
  for j in xrange(low, high):
    if arr[j] < pivot:
      i += 1
      temp = arr[i]
      arr[i] = arr[j]
      arr[j] = temp

  arr[i+1], arr[high] = arr[high], arr[i+1]
  return (i+1)

def _quick_sort(arr, low, high):
  if low < high:
    pivot = partition(arr, low, high)

    _quick_sort(arr, low, pivot - 1)
    _quick_sort(arr, pivot + 1, high)

def quicksort(arr):
  _quick_sort(arr, 0, len(arr) - 1)

def test():
  a = [23,4,2,6,5,7,8,9]
  print ('{} --> {}'.format(a, quicksort(a)))
  a = []
  print ('{} --> {}'.format(a, quicksort(a)))
  a = [23,9,8,7,6,5,4]
  print ('{} --> {}'.format(a, quicksort(a)))
  a = [-1,4,2,5,0]
  print ('{} --> {}'.format(a, quicksort(a)))


if __name__ == '__main__':
  test()
