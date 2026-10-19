
package week4.assignment_problems;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int product = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = product;
            product *= nums[i];
        }

        product = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= product;
            product *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums1)));

        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }
}
