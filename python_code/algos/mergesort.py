#http://interactivepython.org/courselib/static/pythonds/SortSearch/TheMergeSort.html
import copy

def merge(left_array, right_array):
  result = []
  lp = 0
  rp = 0
  result_pointer = 0

  while lp < len(left_array) and rp < len(right_array):
    if left_array[lp] < right_array[rp]:
      result.append(left_array[lp])
      lp += 1
    else:
      result.append(right_array[rp])
      rp += 1



  while lp < len(left_array):
    result.append(left_array[lp])
    lp += 1

  while rp < len(right_array):
    result.append(right_array[rp])
    rp += 1

  return result


def merge_sort(ar):
  if not ar or len(ar) == 1:
    return ar
  mid = len(ar)//2
  left_array = merge_sort(ar[:mid])
  right_array = merge_sort(ar[mid:])

  return merge(left_array, right_array)


def test():
  a = [23,4,2,6,5,7,8,9]
  print ('{} --> {}'.format(a, merge_sort(a)))
  a = []
  print ('{} --> {}'.format(a, merge_sort(a)))
  a = [23,9,8,7,6,5,4]
  print ('{} --> {}'.format(a, merge_sort(a)))
  a = [-1,4,2,5,0]
  print ('{} --> {}'.format(a, merge_sort(a)))



if __name__ == '__main__':
  test()
