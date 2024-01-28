package Algorithm.DynamicProgramming;

public interface DynamicProgramming {

    public Long fib(int n);

    public int[] bestSum(int[] nums, int target);

    public boolean canSum(int[] nums, int target);

    public int[] howSum(int[] nums, int target);

    public int gridTraveler(int m, int n);

    public boolean canConstructString(String[] wordBank, String target);

    public int countConstructString(String[] wordBank, String target);

    public String[][] allConstructString(String[] wordBank, String target);

}
