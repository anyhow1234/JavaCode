package com.javacode.leetcode;

/**
 * @Description:
 * @Author hans
 * @Date 2019/3/24 18:23
 * @Version 1.0
 */
public class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] nums = {1,2,0};
//        System.out.println(firstMissingPositive(nums));
//        int[] nums2 = {3,4,-1,1};
//        System.out.println(firstMissingPositive(nums2));
//        int[] nums3 = {7,8,9,11,12};
//        System.out.println(firstMissingPositive(nums3));
//        int[] nums4 = {0,2,2,1,1};
//        System.out.println(firstMissingPositive(nums4));
//        int[] nums5 = {7,8,9,11,12};
//        System.out.println(firstMissingPositive(nums5));
//        int[] nums6 = {1,2,0};
//        System.out.println(firstMissingPositive(nums6));
//        int[] nums7 = {-1,4,2,1,9,10};
//        System.out.println(firstMissingPositive(nums7));
        int[] nums8 = {11,1,6,11,5,5,-6,9,-3,9,5,4,2,-8,16,-6,-4,2,3};
        System.out.println("初始化数据是 ： ");
        soutInts(nums8);
        System.out.println(firstMissingPositive(nums8));
    }

    public static int firstMissingPositive(int[] nums) {
//        Set<Integer> numsMap = new HashSet();
//        for (int i : nums) {
//            numsMap.add(i);
//        }
//        for (int i =1 ;;i++){
//            if(!numsMap.contains(i)){
//                return i;
//            }
//        }

//        Arrays.sort(nums);
//        if(nums.length == 0 ||  nums[nums.length - 1] <= 0){
//            return 1;
//        }
//        int _index = nums[0] > 0 ? 1 : 0;
//        for(int i = 0 ; i < nums.length ; i++){
//            if(nums[i] > 0){
//                if(i > 0 && nums[i] != nums[i - 1]){//防止两个数相等
//                    _index++;
//                }
//                if(nums[i] != _index){
//                    return _index;
//                }
//            }
//        }
//        _index = nums[nums.length - 1] + 1;
//        return _index;

        if(nums.length == 0){
            return 1;
        }
        for(int i = 1 ; i <= nums.length; i++){
            if(nums[i - 1] > 0 && nums[i - 1] < nums.length && nums[i - 1] < i){//只向前移动
                swap(nums,i - 1,nums[i - 1] - 1);
            }
            System.out.println("第" + i + "遍排序后 ： ");
            soutInts(nums);
        }
        for(int i = 1 ; i <= nums.length; i++){
            if(nums[i - 1] != i){
                return i;
            }
        }
        return nums.length + 1;
    }
    public static void swap(int[] nums, int source, int target){
        if(source == target)
            return;
        if(nums[source] == nums[target]){
            nums[source] = -1;
            return;
        }
        int temp = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }
    public static void soutInts(int[] nums){
//        System.out.println();
        System.out.print("[");
        for(int i = 0 ; i < nums.length ; i++){
            if(i == nums.length - 1){
                System.out.print(nums[i] + "]");
            } else {
                System.out.print(nums[i] + ",");
            }
        }
        System.out.println();
    }



}
