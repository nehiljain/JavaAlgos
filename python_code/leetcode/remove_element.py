"""
Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

"""

def solution(ar, val):
	if not ar:
		return 0

	size = len(ar)
	i = 0
	while i < size:
		if ar[i] == val:
			j = i
			while ar[j] != None or j < size-1:
				ar[j], ar[j+1] = ar[j+1], None
				j = j + 1
			size = size - 1
		else:
			i = i + 1
	return size


if __name__ == '__main__':

	assert solution([3,3,3,2,2], 3) == 2
	assert solution([3,3,3,3,3], 3) == 0
	assert solution([1,1,1,2,2], 3) == 5
	assert solution([0,0,0,0,0], 0) == 0
	assert solution([], 0) == 0
