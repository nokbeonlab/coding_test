import java.util.*;

public class T02_TwoSum {
    public static void main(String[] args) {

        T02_TwoSum a = new T02_TwoSum();

        int[] nums = {2, 8, 11, 14};
        int target = 16;
        int[] result = a.sovle(nums, target);
        for(int i : result) {
            System.out.println(i+" ");
        }

    }

    public int[] sovle(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                result[0] = value + 1;
                result[1] = i + 1;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
