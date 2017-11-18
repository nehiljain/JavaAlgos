"""
Given an integer, write a function to determine if it is a power of three.
"""
import math

def solution(n):
	if n <= 0:
		return False
	else:
		return float(round(math.log(n, 3), 10)).is_integer()



if __name__ == '__main__':
	assert solution(524287) == False
	assert solution(27) == True
	assert solution(0) == False
	assert solution(9) == True



