"""Given an integer columnNumber, 
return its corresponding column title 
as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28"""


import string


class Solution:
    def convertToTitle(self, n):
        """
        :type n: int
        :rtype: str
        """
        result = ''
        distance = ord('A')

        while n > 0:
            y = (n-1) % 26
            n = (n-1) // 26
            s = chr(y+distance)
            result = ''.join((s, result))

        return result
