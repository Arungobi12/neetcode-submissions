class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        l = []
        s = list(set(nums))
        for i in range(len(s)):
            n = nums.count(s[i])
            if n>=k:
                l.append(s[i])
    
        if l == []:
            return nums
        else :
            return l