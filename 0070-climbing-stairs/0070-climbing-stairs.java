class Solution {
    public int climbStairs(int n) {
        int[] memory = new int[n+1];
        return climbStairsHelper(n, memory);
    }

    private int climbStairsHelper(int n, int[] memory) {
        if (n == 1) {
            return 1;
        } 
        if (n == 2) {
            return 2;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        memory[n] = climbStairsHelper(n - 1, memory) + climbStairsHelper(n - 2, memory);
        return memory[n];
    }
}