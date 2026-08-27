class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        a = []
        for i in range(len(nums)):
            n = nums.count(nums[i])
            if n>=k:
                    a.append(nums[i])
        ans = list(set(a))
        return ans