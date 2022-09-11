package main.java.Ylab.tasks.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static void findFirstPair(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
            {
                System.out.printf("Пара найдена (%d, %d)",
                        nums[map.get(target - nums[i])], nums[i]);
                return;
            }

            map.put(nums[i], i);
        }
        System.out.println("Пара не найдена");
    }

    public static void main(String[] args) {
        int[] nums = {3,4,2,7};
        int target = 10;
        findFirstPair(nums, target);
    }
}
