class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        l = []
        for i in range(len(nums)):
            n = nums.count(nums[i])
            if n>=k:
                l.append(nums[i])
            
        lis = list(set(l))
        return lis