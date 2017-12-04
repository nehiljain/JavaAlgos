"""
 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
	"((()))",
	"(()())",
	"(())()",
	"()(())",
	"()()()"
]

"""


"""

n = 1
()


n = 2

()()
(())

n = 3

((()))
(()())


brute force
generate all permutations
and check if valid
o(n!)



"""

def generate(s, left, right, n, result):
	if not n or n <= 0:
		return []
	if left == n and right == n:
		result.append(s)
		return
	if left < n:
		generate(s + '(', left + 1, right, n, result)
	if right < left:
		generate(s + ')', left, right + 1, n, result)




def solution(num):
	result = []
	generate('', 0, 0, num, result)
	return len(result)

if __name__ == '__main__':
	assert solution(3) == 5
	assert solution(2) == 2
	assert solution(10) == 16796
	assert solution(0) == 0
	assert solution(None) == 0


