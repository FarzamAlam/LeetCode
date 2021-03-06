/**
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Solution Analysis:
Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
Memory Usage: 39.7 MB, less than 94.35% of Java online submissions for Sort Array By Parity.

*/


class Solution {
    public int[] sortArrayByParity(int[] A) {
		int m = 0; int temp = 0;
        for(int i = 0; i<A.length;i++){
			if(A[i] % 2 == 0){
			   temp = A[i];
			   A[i] = A[m];
			   A[m] = temp;
			   m ++;
			  }
			}
			return A;
    }
}