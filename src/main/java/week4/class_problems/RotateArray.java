
package week4.class_problems;

import java.util.Arrays;

public class RotateArray {

    static int[] rotateArray(int[] nums, int k) {
        k = k % nums.length;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotateArray(nums1, 3)));

        int[] nums2 = {1, 2};
        System.out.println(Arrays.toString(rotateArray(nums2, 3)));
    }
}
