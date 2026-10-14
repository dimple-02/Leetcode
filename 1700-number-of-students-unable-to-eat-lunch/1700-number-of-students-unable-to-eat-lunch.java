class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<students.length;i++){
            q.offer(students[i]);
        }
        int j=0;
        int unableToEat=0;
        while(!q.isEmpty() && unableToEat<q.size()){
            if(q.peek()==sandwiches[j]){
                q.poll();
                j++;
                unableToEat=0;
            }
            else{
                q.offer(q.poll());
                unableToEat++; 
            }
        }
        return unableToEat;
    }
}