/**
 * File: bubble_sort.java
 * Created Time: 2022-11-25
 * Author: krahets (krahets@163.com)
 */

package chapter_sorting_practice;

import java.util.*;

public class bubble_sort {

    /* 冒泡排序（标志优化） */
    static void bubbleSortWithFlag(int[] nums) {
        // 外循环：未排序区间为 [0, i]
        for (int i = nums.length - 1; i > 0; i--) {
            boolean flag = false;
            // 内循环：将未排序区间 [0, i] 中的最大元素交换至该区间的最右端
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j+1]) {
                    // 交换 nums[j] 与 nums[j+1]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    //记录交换元素
                    flag = true;
                }
            }

            //此轮“冒泡”未交换任何元素，直接跳出
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 3, 1, 5, 2 };
        bubbleSortWithFlag(nums1);
        System.out.println("冒泡排序完成后 nums1 = " + Arrays.toString(nums1));
    }
}
