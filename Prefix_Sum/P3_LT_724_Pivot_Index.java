package Prefix_Sum;

public class P3_LT_724_Pivot_Index {

        public int pivotIndex(int[] nums) {
            // make 'nums' into its 'prefix-Sum'
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i-1];
            }
            // traverse the array once again (except the 0th index)
            if (nums[0] == nums[nums.length-1]) return 0; // case for 0th index
            for (int i = 1; i < nums.length; i++) {
                if (nums[i-1] == nums[nums.length-1]-nums[i]) return i;
            }
            return -1; // if not found then return -1
        }
    }

