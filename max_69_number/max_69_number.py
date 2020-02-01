class Solution(object):
    def maximum69Number (self, num):
        """
        :type num: int
        :rtype: int
        """
        num_list = list(str(num))
        for i in range(0,len(num_list)):
            if int(num_list[i]) == 6:
                num_list[i] = 9
                return int(''.join(map(str, num_list)))