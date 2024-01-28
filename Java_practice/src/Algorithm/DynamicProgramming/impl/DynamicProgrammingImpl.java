package Algorithm.DynamicProgramming.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.Renderer;

import Algorithm.DynamicProgramming.DynamicProgramming;

public class DynamicProgrammingImpl implements DynamicProgramming {

    @Override
    public int gridTraveler(int m, int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gridTraveler'");
    }

    private List<Integer> bestSumHelper(int[] nums, int target, Map<Integer, List<Integer>> memo) {

        if (memo.containsKey(target))
            return memo.get(target);

        if (target == 0) {
            return new ArrayList<Integer>();
        }
        if (target < 0) {
            return null;
        }

        List<Integer> shortestCombination = null;
        for (int i : nums) {
            int remainder = target - i;

            List<Integer> remainderRes = bestSumHelper(nums, remainder, memo);

            if (remainderRes != null) {
                List<Integer> current = new ArrayList<>(remainderRes);
                current.add(i);
                if (shortestCombination == null || current.size() < shortestCombination.size()) {
                    shortestCombination = current;
                }
            }
        }
        memo.put(target, shortestCombination);
        return shortestCombination;

    }

    @Override
    public int[] bestSum(int[] nums, int target) {
        Map<Integer, List<Integer>> memo = new HashMap<>();
        List<Integer> helperRes = bestSumHelper(nums, target, memo);
        int[] ans = helperRes.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }

    private boolean canSumHelper(int[] nums, int target, Map<Integer, Boolean> memo) {
        if (memo.containsKey(target))
            return memo.get(target);

        if (target == 0)
            return true;
        if (target < 0)
            return false;

        for (int i : nums) {
            int remider = target - i;
            if (canSumHelper(nums, remider, memo) == true) {
                memo.put(target, true);
                return true;
            }
        }

        memo.put(target, false);
        return false;
    }

    @Override
    public boolean canSum(int[] nums, int target) {
        Map<Integer, Boolean> memo = new HashMap<>();
        return canSumHelper(nums, target, memo);
    }

    private List<Integer> howSumHelper(int[] nums, int target, Map<Integer, List<Integer>> memo) {

        if (target == 0) {
            return new ArrayList<Integer>();
        }

        if (target < 0) {
            return null;
        }

        if (memo.containsKey(target)) {
            return memo.get(target);
        }

        for (int i : nums) {
            int remainder = target - i;
            List<Integer> remainderRes = howSumHelper(nums, remainder, memo);
            if (remainderRes != null) {
                List<Integer> currentRes = new ArrayList<>(remainderRes);
                currentRes.add(i);
                memo.put(remainder, currentRes);
                return currentRes;
            }
        }

        memo.put(target, null);
        return null;
    }

    @Override
    public int[] howSum(int[] nums, int target) {
        Map<Integer, List<Integer>> memo = new HashMap<>();
        List<Integer> helperRes = howSumHelper(nums, target, memo);
        if (helperRes == null) {
            return null;
        }
        int[] ans = helperRes.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }

    private boolean canConstructStringHelper(String[] wordbank, String target, Map<String, Boolean> memo) {
        if (memo.containsKey(target))
            return memo.get(target);

        if (target.equals("")) {
            return true;
        }

        for (String s : wordbank) {
            if (target.startsWith(s)) {
                String suffx = target.substring(s.length());
                if (canConstructStringHelper(wordbank, suffx, memo)) {
                    memo.put(target, true);
                    return true;
                }

            }
        }

        memo.put(target, false);
        return false;

    }

    @Override
    public boolean canConstructString(String[] wordBank, String target) {
        Map<String, Boolean> memo = new HashMap<>();
        return canConstructStringHelper(wordBank, target, memo);
    }

    private int countConstructStringHelper(String[] workbank, String target, Map<String, Integer> memo) {

        if (memo.containsKey(target))
            return memo.get(target);

        if (target.equals("")) {
            return 1;
        }
        int ans = 0;
        for (String s : workbank) {

            if (target.startsWith(s)) {
                String suffix = target.substring(s.length());
                int res = countConstructStringHelper(workbank, suffix, memo);
                if (res != 0) {
                    ans += res;
                }

            }

        }
        memo.put(target, ans);
        return ans;
    }

    @Override
    public int countConstructString(String[] wordBank, String target) {
        // TODO Auto-generated method stub
        Map<String, Integer> memo = new HashMap<>();
        return countConstructStringHelper(wordBank, target, memo);
    }

    private List<List<String>> allConstructStringHelper(String[] wordbank, String target,
            Map<String, List<List<String>>> memo) {

        if (memo.containsKey(target))
            return memo.get(target);

        if (target.equals("")) {
            List<List<String>> emptyList = new ArrayList<>();
            emptyList.add(new ArrayList<>());
            return emptyList;

        }

        List<List<String>> res = new ArrayList<>();
        for (String s : wordbank) {
            if (target.startsWith(s)) {
                String suffix = target.substring(s.length());
                List<List<String>> suffixRes = allConstructStringHelper(wordbank, suffix, memo);
                for (List<String> list : suffixRes) {
                    List<String> tempList = new ArrayList<>();
                    tempList.add(s);
                    tempList.addAll(list);
                    res.add(tempList);
                }

            }
        }
        memo.put(target, res);
        return res;
    }

    @Override
    public String[][] allConstructString(String[] wordBank, String target) {
        Map<String, List<List<String>>> memo = new HashMap<>();

        List<List<String>> ansList = allConstructStringHelper(wordBank, target, memo);
        return ansList.stream()
                .map(innerList -> innerList.toArray(new String[0]))
                .toArray(String[][]::new);
    }

    private Long fibHelper(int n, Map<Integer, Long> memo) {
        if (memo.containsKey(n))
            return memo.get(n);

        if (n == 1)
            return 1L;
        if (n == 0)
            return 1L;

        Long res = fibHelper(n - 1, memo) + fibHelper(n - 2, memo);
        memo.put(n, res);
        return res;
    }

    @Override
    public Long fib(int n) {
        Map<Integer, Long> memo = new HashMap<>();
        return fibHelper(n, memo);
    }

}
