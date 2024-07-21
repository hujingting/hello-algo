/**
 * Created Time: 2023-7-12
 * Author: jingtinghu
 */

package chapter_sorting_practice;

import java.util.*;


public class insertion_sort {
    /* 插入排序 */
    static void insertionSort(int[] nums) {
        //初始状态下，数组的第 1 个元素已完成排序
        for(int i = 1; i < nums.length; i++) {
            //选取数组的第 2 个元素作为 base ，将其插入到正确位置
            int base = nums[i], j = i - 1;
            // 内循环：将 base 插入到已排序区间[0, i-1] 中的正确位置
            while (j >=0 && nums[j] > base) {
                nums[j+1] = nums[j];
                j--;
            }
            //将 base 赋值到正确位置
            nums[j+1] = base;
        }
    }

    /**
     * 折半插入排序
     */
        
static void halfSort(int[] nums, int size) {
        int i, j, low, high, mid;
        for (i = 2; i < size; i++) {
            nums[0] = nums[i];
            low = 1;
            high = i - 1;
            while (low <= high) {
                mid = (low + high) / 2;
                if (nums[mid] > nums[0]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            for (j = i - 1; j >= low; j--) {
                nums[j + 1] = nums[j];
                nums[low] = nums[0];
            }
        }
    }




    public static void main(String[] args) {
        int[] nums = { 4, 1, 3, 1, 5, 2 };
        insertionSort(nums);
        System.out.println("插入排序完成后 nums = " + Arrays.toString(nums));

        int[] nums1 = { 4, 1, 3, 1, 5, 2 };
        halfSort(nums1, nums1.length);
        System.out.println("插入排序完成后 nums1 = " + Arrays.toString(nums1));
    }
}
