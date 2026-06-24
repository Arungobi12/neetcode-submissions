class Solution:
    def twoSum(self, nums: List[int], target1: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]==target1:
                    return[i,j]