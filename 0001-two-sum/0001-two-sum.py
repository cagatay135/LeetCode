class Solution(object):
    def twoSum(self, nums, target):
        results = []
        for j in range(len(nums)):
            for k in range(j+1,len(nums)):
                if (nums[j]+nums[k]==target):
                    results.append(j)
                    results.append(k)
                    return results
