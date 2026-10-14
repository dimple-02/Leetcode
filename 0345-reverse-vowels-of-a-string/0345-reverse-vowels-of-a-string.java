class Solution {
    public String reverseVowels(String s) {
        StringBuilder ns = new StringBuilder();
        StringBuilder v = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                v.append(c);
            }
        }

        int idx = v.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                ns.append(v.charAt(--idx));
            } else {
                ns.append(c);
            }
        }

        return ns.toString();
    }
}
