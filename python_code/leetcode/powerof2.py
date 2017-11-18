"""
Given an integer, write a function to determine if it is a power of two.
"""
import math

def solution(n):
	if n <= 0:
		return False
	else:
		return float(round(math.log(n, 2), 10)).is_integer()



if __name__ == '__main__':
	print solution(524287))
	print "%s is power of 2 = %s" % (511, solution(511))
	print "%s is power of 2 = %s" % (16, solution(16))
	print "%s is power of 2 = %s" % (536870912, solution(536870912))
	print "%s is power of 2 = %s" % (-16, solution(-16))
	print "%s is power of 2 = %s" % (-8, solution(-8))



