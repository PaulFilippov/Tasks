package leetCode;

/*
1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

class Solution {

    private int[] arr = new int[]{15, 2, 11, 7};

    public int[] twoSum(int[] nums, int target) {

        int[] indexOfTwoNumbers = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int firstNumber = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int secondNumber = nums[j];
                if ((firstNumber + secondNumber) == target) {
                    indexOfTwoNumbers[0] = i;
                    indexOfTwoNumbers[1] = j;
                    return indexOfTwoNumbers;
                }
            }
        }
        return new int[]{-1, -1};
    }

//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if ( i != j && nums[i] + nums[j] == target) {
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//    }

    public static void main(String args[]) {

        Solution s = new Solution();
        int[] mas = s.twoSum(s.arr, 9);

        for (int i : mas) {
            System.out.println(i);
        }

    }

}