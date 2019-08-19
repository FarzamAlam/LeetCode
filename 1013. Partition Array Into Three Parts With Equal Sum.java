/**
Given an array A of integers, return true if and only if we can partition the array into three non-empty parts with equal sums.

Formally, we can partition the array if we can find indexes i+1 < j with (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])

 

Example 1:

Input: [0,2,1,-6,6,-7,9,1,2,0,1]
Output: true
Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
Example 2:

Input: [0,2,1,-6,6,7,9,-1,2,0,1]
Output: false
Example 3:

Input: [3,3,6,5,-2,2,5,1,-9,4]
Output: true
Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
Solution Analysis:
Runtime: 1 ms, faster than 100.00% of Java online submissions for Partition Array Into Three Parts With Equal Sum.
Memory Usage: 50 MB, less than 100.00% of Java online submissions for Partition Array Into Three Parts With Equal Sum.
**/

class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum =0,count =0, partition =0;
		for(int i =0;i<A.length;i++)
			sum +=A[i];
		if(sum%3 !=0)
			return false;
		else{
			for(int j=0;j<A.length;j++){
				partition += A[j];
				if(partition == sum/3){
					count++;
					partition = 0;
				}
				
			}
			if(count == 3)
				return true;
				
		}
		return false;
    }
}