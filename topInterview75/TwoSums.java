package topInterview75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    /**
     * https://leetcode.com/problems/two-sum/description/
     */


    public static int[] twoSum(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        int j = 0;
        while (j<nums.length){
            if(sum == target && ans.size()>0){
                break;
            } else {
                ans.clear();
                sum = 0;
            }
            for (int i = 0 + j; i<nums.length; i++){
                if (sum + nums[i]<= target){
                    sum+=nums[i];
                    ans.add(i);
                } else if (i>0 && sum - nums[i-1] + nums[i]<= target && sum - nums[i-1] + nums[i] >=0){
                    sum+=nums[i]- nums[i-1] ;
                    ans.remove(ans.size() - 1);
                    ans.add(i);
                }
                if(sum == target && target != 0){
                    break;
                }
            }
            j++;
        }
        int[] array = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) array[i] = ans.get(i);
        return array;
    }

    public static int[] twoSum_1(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}
