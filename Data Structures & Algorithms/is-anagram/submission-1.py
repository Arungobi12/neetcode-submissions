class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        a = sorted(s)
        b = sorted(t)
        for i in range(len(a)):
            for j in  range(len(b)):
                if a==b :
                    return True
        return False
        