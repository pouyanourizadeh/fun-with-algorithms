class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        even_digit_elements_count = 0
        
        for i in range(0,len(nums)):
            if len(list(str(nums[i]))) % 2 == 0:
                even_digit_elements_count += 1
            i += 1
        return even_digit_elements_count
