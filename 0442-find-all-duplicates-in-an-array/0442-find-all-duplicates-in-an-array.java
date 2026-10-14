class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            if(set.contains(x)) list.add(x);
            set.add(x);
        }
        return list;
    }
}