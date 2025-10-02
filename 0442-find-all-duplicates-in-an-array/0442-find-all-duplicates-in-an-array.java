class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> arr=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                arr.add(num);
            }
            set.add(num);
        }
        return new ArrayList<>(arr);
    }
}