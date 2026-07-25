class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> checkDuplicate=new HashSet<>();
        for(int num : nums){
            if(!checkDuplicate.add(num)){
                return true;
            }
        }
        return false;
    //    return  Arrays.stream(nums).distinct().count() != nums.length;
    }
}