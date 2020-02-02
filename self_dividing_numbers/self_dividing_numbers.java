/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:

Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:

The boundaries of each input argument are 1 <= left <= right <= 10000.
*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> finalList = new ArrayList<Integer>();
        
        while (left < right){
            int currentNumber = left;
            boolean is_prime = true;
            
            while (left > 0) {
                int digit = left % 10;
                left = left / 10;
                if (digit != 0){
                    if (!(currentNumber % digit == 0)){
                        is_prime = false;
                        break;
                    }
                }
            }
        
        if (is_prime == true){
            finalList.add(currentNumber);
        }
            
        left = currentNumber +1;
        }
    return finalList;
    }
}