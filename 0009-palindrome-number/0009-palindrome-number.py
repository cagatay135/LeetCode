class Solution(object):
    def isPalindrome(self, x):
        str_number = str(x)
        return str_number == str_number[::-1]