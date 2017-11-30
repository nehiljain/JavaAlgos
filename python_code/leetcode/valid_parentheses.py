
"""
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
"""

def solution(s):
	if not s:
		return False

	ar = [bracket for bracket in s]

	if len(ar) % 2 != 0:
		return False

	bracket_pairs_dict = {
		"}": "{",
		"]": "[",
		")": "("
	}

	b_stack = []

	for bracket in ar:
		if bracket in bracket_pairs_dict:
			if not b_stack:
				return False
			opening_bracket = b_stack.pop()
			if bracket_pairs_dict[bracket] != opening_bracket:
				return False
		else:
			b_stack.append(bracket)
	if not b_stack:
		return True
	else:
		return False

if __name__ == '__main__':
	assert solution('{}')
	assert solution('[]')
	assert solution('{}[') == False
	assert solution('{[}') == False
	assert solution('') == False
	assert solution('{}[]')
	assert solution('({}[])')
	assert solution('({()}[[]])')
	assert solution('{{')



