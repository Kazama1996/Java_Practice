package Algorithm.DynamicProgramming.impl;

import java.util.ArrayList;
import java.util.List;

import Algorithm.DynamicProgramming.DynamicProgramming;

public class DynamicProgrammingTabulationimpl implements DynamicProgramming {

    @Override
    public int[] bestSum(int[] nums, int target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bestSum'");
    }

    private boolean canSumHelper(int[] nums, int target) {
        boolean[] res = new boolean[target + 1];

        res[0] = true;
        for (int i = 0; i <= target; i++) {
            if (res[i]) {
                for (int num : nums) {
                    if (i + num <= target) {
                        res[i + num] = true;
                    }
                }
            }
        }

        return res[target];
    }

    @Override
    public boolean canSum(int[] nums, int target) {
        // TODO Auto-generated method stub
        return canSumHelper(nums, target);
    }

    private List<Integer> howSumHelper(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>(target + 1);

        res.add(new ArrayList<>());

        for (int i = 1; i <= target; i++) {
            res.add(null);
        }

        for (int i = 0; i <= target; i++) {
            if (res.get(i) != null) {
                for (int num : nums) {
                    int targetIdx = i + num;
                    List<Integer> targetList = res.get(targetIdx);
                    if (targetList == null) {
                        targetList = new ArrayList<>();
                    }
                    List<Integer> src = res.get(i);
                    targetList.addAll(src);
                    targetList.add(num);
                }
            }
        }

        return res.get(target);
    }

    @Override
    public int[] howSum(int[] nums, int target) {
        // TODO Auto-generated method stub
        List<Integer> helperRes = howSumHelper(nums, target);
        if (helperRes == null)
            return null;
        int[] ans = helperRes.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }

    @Override
    public boolean canConstructString(String[] wordBank, String target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canConstructString'");
    }

    @Override
    public int countConstructString(String[] wordBank, String target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countConstructString'");
    }

    @Override
    public String[][] allConstructString(String[] wordBank, String target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'allConstructString'");
    }

    private int gridTravlerHelper(int m, int n) {
        int[][] memo = new int[n + 1][m + 1];

        memo[1][1] = 1;

        for (int y = 1; y <= n; y++) {
            for (int x = 1; x <= m; x++) {
                int current = memo[y][x];
                if (x + 1 <= m)
                    memo[y][x + 1] += current;
                if (y + 1 <= n)
                    memo[y + 1][x] += current;
            }
        }

        return memo[n][m];

    }

    @Override
    public int gridTraveler(int m, int n) {
        // TODO Auto-generated method stub
        return gridTravlerHelper(m, n);
    }

    private Long fibHelper(int n) {
        if (n == 0) {
            return 0L;
        }

        Long[] memo = new Long[n + 1];

        memo[0] = 0L;
        memo[1] = 1L;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n];
    }

    @Override
    public Long fib(int n) {
        // TODO Auto-generated method stub
        return fibHelper(n);
    }

}
