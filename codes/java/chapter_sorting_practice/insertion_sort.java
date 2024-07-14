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

    public static void main(String[] args) {
        int[] nums = { 4, 1, 3, 1, 5, 2 };
        insertionSort(nums);
        System.out.println("插入排序完成后 nums = " + Arrays.toString(nums));
    }
}
