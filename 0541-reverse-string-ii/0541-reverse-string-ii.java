class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i += 2 * k) {
            int j = Math.min(i + k - 1, a.length - 1);
            reverse(a, i, j);
        }
        return new String(a);
    }

    private void reverse(char[] a, int left, int right) {
        while (left < right) {
            char temp = a[left];
            a[left++] = a[right];
            a[right--] = temp;
        }
    }
}