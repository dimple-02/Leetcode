class Solution {
    public String reversePrefix(String word, char ch) {
        char[] a = word.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]==ch){
                reverse(a,0,i);
                break;
            }
        }
        return new String(a);
    }
    void reverse(char[] a,int l, int r){
        while(l<r){
            char temp=a[l];
            a[l++]=a[r];
            a[r--]=temp;
        }
    }
}