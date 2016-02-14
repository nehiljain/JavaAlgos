

# Question of Leetcode
# Valid Analgram
# Given two strings s and t, write a function to determine if t is an anagram of s.

class Solution(object):
    @staticmethod
    def is_anagram(s1, s2):
        freq_map = []
        for i in range(256):
            freq_map[i] = 0

        for ch in s1:
            freq_map[ord(ch)] += 1

        for ch in s2:
            if freq_map[ord(ch)] == 0:
                return False
            freq_map[ord(ch)] -= 1

        for i in range(256):
            if not freq_map[i] == 0:
                return False

        return True
