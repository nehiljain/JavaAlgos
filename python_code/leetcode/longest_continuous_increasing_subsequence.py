"""
 Given an unsorted array of integers, find the length of longest continuous increasing subsequence.

Example 1:

Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.

Example 2:

Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1.

Note: Length of the array will not exceed 10,000.
"""


def solution(nums):
	if not nums:
		return 0
	max_len = 1

	size = 1
	for i, item in enumerate(nums):
		if i+1 < len(nums) and nums[i+1] > item:
			size = size + 1
		else:
			max_len = max(max_len, size)
			size = 1
	return max_len




if __name__ == '__main__':
	assert solution([0,0,0,0,0,0,0]) == 1
	assert solution([]) == 0
	assert solution([987654321]) == 1
	assert solution([12345232]) == 5

