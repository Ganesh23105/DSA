class Solution(object):
    def reverseWords(self, s):
        l1=s.split()
        l1.reverse()
        return " ".join(l1)      