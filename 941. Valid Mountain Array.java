/**
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]
 

Example 1:

Input: [2,1]
Output: false
Example 2:

Input: [3,5,5]
Output: false
Example 3:

Input: [0,3,2,1]
Output: true
 

Note:

0 <= A.length <= 10000
0 <= A[i] <= 10000 
 
 
Solution Analysis:
Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Mountain Array.
Memory Usage: 40.1 MB, less than 100.00% of Java online submissions for Valid Mountain Array.
**/

/**
Algorithm:
If the length is less than 3 or first element is larger than second element, return false.
Loop through array, find where element is less than previous element, this will be our maxHeight.
If we got maxHeight and previous element is larger than current element, thus return false.
**/
class Solution {
    public boolean validMountainArray(int[] A) {
    boolean max = false;
        if(A.length<3 || A[0]>=A[1])
            return false;
        for(int i=1;i<A.length;i++){
            if(A[i]<A[i-1])
                max = true;
            if(max ==true && A[i]>=A[i-1])
                return false;
        }

        return max;
    }
}