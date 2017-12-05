"""
Consider an array of integers, . We define the absolute difference between two elements, and (where ), to be the absolute value of .

Given an array of integers, find and print the minimum absolute difference between any two elements in the array.

Input Format

The first line contains a single integer denoting (the number of integers).
The second line contains space-separated integers describing the respective values of .

Constraints

Output Format

Print the minimum absolute difference between any two elements in the array.

Sample Input 0

3
3 -7 0

Sample Output 0

3

Explanation 0

With integers in our array, we have three possible pairs: , , and . The absolute values of the differences between these pairs are as follows:

Notice that if we were to switch the order of the numbers in these pairs, the resulting absolute values would still be the same. The smallest of these possible absolute differences is , so we print as our answer.
"""

import sys

def minimum_absolute_difference(n, arr):
    if not arr or n <= 1:
      return None
    arr = sorted(arr)
    min_diff = abs(arr[0] - arr[1])
    for i in xrange(n-1):
      min_diff = min(abs(arr[i]-arr[i+1]), min_diff)
    return min_diff

if __name__ == "__main__":
    assert minimum_absolute_difference(3,[3,-7,0]) == 3
    assert minimum_absolute_difference(3, [0,0,0]) == 0
    assert minimum_absolute_difference(1, [2]) == None
    assert minimum_absolute_difference(0, None) == None
    assert minimum_absolute_difference(5, [1,2,3,4,5]) == 1
    assert minimum_absolute_difference(5, [1,2,6,7,2]) == 0

