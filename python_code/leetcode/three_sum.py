"""
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
	[-1, 0, 1],
	[-1, -1, 2]
]
"""

"""

approach

brute force
every possible combination sum if any is 0 then add to result list
0(n3)


better auxilary space
O(n2)
loop though pairs and store in hash to check if there is an element which will has hash[-element in it]

better no auxilary space
sort the array ??

[-4, -1, -1, 0, 1, 2]
"""


def solution(ar):
	if not ar:
		return []

	pair_sums = {}
	ar = sorted(ar)
	result = set()

	for i in xrange(0, len(ar)-1):
		for j in xrange(i+1, len(ar)):
			neg_sum = - (ar[i] + ar[j])
			neg_sum_index = pair_sums.get(neg_sum, None	)

			if neg_sum_index and \
				neg_sum_index not in {i, j}:
				result.add(tuple(sorted([ar[i], ar[j], neg_sum])))
			else:
			    pair_sums[ar[j]] = j

	return map(list,result)

if __name__ == "__main__":
	input_ar = [0, -1, 2, -3, 1]
	result = [[-1, 0, 1], [-3, 1, 2]]
	assert sorted(solution(input_ar)) == sorted(result)


	input_ar = [-1, 0, 1, 2, -1, -4]
	result = [
		[-1, 0, 1],
		[-1, -1, 2]
	]
	assert sorted(solution(input_ar)) == sorted(result)

	input_ar = [0,0,0,0,0,0]
	result = []

	assert solution(input_ar) == [[0,0,0]]

	input_ar = [1,2,3,4,5]
	assert solution(input_ar) == []

	input_ar = [-1,-2,-3,-4,-5]
	assert solution(input_ar) == []


	input_ar = [-1,-2,-3,-4,0,3]
	result = [[-2,-1,3], [-3,0,3]]
	assert solution(input_ar) == result

	input_ar = [-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6]
	result = [[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]]
	assert sorted(solution(input_ar)) == sorted(result)

