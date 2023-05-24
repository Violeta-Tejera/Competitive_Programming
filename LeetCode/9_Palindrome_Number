# Given an integer x, return true if x is a palindrome, and false otherwise

class Solution(object):
    def isPalindrome(self, x):
        if(x < 0 or (x != 0 and x % 10 == 0)):
            return False

        mid = 0
        while x > mid:
            mid = mid*10 + x%10
            x //=10
        
        return x == mid or x == mid//10
        
