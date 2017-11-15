"""
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
"""
import collections

def solution(nums, target):
	if not nums:
		return []
	num_counter = {}
	for index, item in enumerate(nums):
		if num_counter[target - item]:
			return [index, num_counter[target - item]]
		else:
			num_counter[item] = index



if __name__ == '__main__':
	print solution([1,2,3,4,5,6], 7)

