class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a : asteroids){
            boolean destroyed=false;
            while(!st.isEmpty() && a<0 && st.peek()>0){
                if(st.peek()< -a){
                    st.pop();
                }
                else if(st.peek()== -a){
                    st.pop();
                    destroyed=true;
                    break;
                }
                else{
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                    st.push(a);
            }
        }
        int[] arr = new int[st.size()];
        for(int i=0;i<arr.length;i++){
            arr[arr.length-i-1]=st.pop();
        }
        return arr;
    }
}