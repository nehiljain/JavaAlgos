"""
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Given input matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]

Example 2:

Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
],

rotate the input matrix in-place such that it becomes:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
"""


"""
Thoughts
[
  [00,01],
  [10,11]
]


[
  [00,10],
  [01,11]
]

[
  [10,00],
  [11,01]
]

[
  [10,00],
  [11,01]
]



[
  [00,01,02],
  [10,11,12],
  [20,21,22]
]

[
  [20,10,00],
  [21,11,01],
  [22,12,02]
]


rotate outer to inner values


[
  [00,01,02,03],
  [10,11,12,13],
  [20,21,22,23],
  [30,31,32,33]
]


temp = 03
[
  [None,01,02,00],
  [10,11,12,13],
  [20,21,22,23],
  [30,31,32,33]
]

temp = 33
[
  [None,01,02,00],
  [10,11,12,13],
  [20,21,22,23],
  [30,31,32,03]
]

temp = 30
[
  [None,01,02,00],
  [10,11,12,13],
  [20,21,22,23],
  [33,31,32,03]
]

temp = None
[
  [30,01,02,00],
  [10,11,12,13],
  [20,21,22,23],
  [33,31,32,03]
]

temp = 13
[
  [30,None,02,00],
  [10,11,12,01],
  [20,21,22,23],
  [33,31,32,03]
]

temp = 32
[
  [30,None,02,00],
  [10,11,12,01],
  [20,21,22,23],
  [33,31,13,03]
]

temp = 32


i - 0, j-0,1,2
[00,03,33,30] ij, ij+3, i+3j+3, i+3j
[01,13,32,20] ij, i+1j+2, i+3j+1
[02,23,31,10]

[11,12,22,21]
[
  [30,None,02,00],
  [10,11,12,01],
  [20,21,22,23],
  [33,31,13,03]
]

horozontal flip
================
[00,01,02
10,11,12
20,21,22]

00, 02 i = 0,1,2 j = 0,1
10, 12
20, 22



Couldnt complete myself but inital intuition was correct
"""


def transpose(a):
  for i in xrange(len(a)):
    for j in xrange(i+1, len(a)):
      a[j][i], a[i][j] = a[i][j], a[j][i]

  return a

def horizontal_flip(a):
  for i in xrange(len(a)):
    for j in xrange(len(a)/2):
      a[i][j], a[i][len(a) - j - 1] = a[i][len(a) - j - 1], a[i][j]

  return a

def solution(ar):
  return horizontal_flip(transpose(ar))



if __name__=='__main__':
  a1 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
  ]

  ta1 = [
    [1,4,7],
    [2,5,8],
    [3,6,9]
  ]
  assert transpose(a1) == ta1

  ha1 = [
    [7,4,1],
    [8,5,2],
    [9,6,3]
  ]

  assert horizontal_flip(ta1) == ha1
  assert solution(a1) == ha1
