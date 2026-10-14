class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) freq.put(x, freq.getOrDefault(x, 0) + 1);

        int count = 0;

        for (int key : freq.keySet()) {
            if (k == 0) {
                if (freq.get(key) > 1) count++;
            } else {
                if (freq.containsKey(key + k)) count++;
            }
        }
        return count;
    }
}
