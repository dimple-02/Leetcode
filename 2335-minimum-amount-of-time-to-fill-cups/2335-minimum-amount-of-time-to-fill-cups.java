class Solution {
    public int fillCups(int[] amount) {
        int total = amount[0] + amount[1] + amount[2];
    int largest = Math.max(amount[0], Math.max(amount[1], amount[2]));

    return Math.max(largest, (total + 1) / 2);
    }
}