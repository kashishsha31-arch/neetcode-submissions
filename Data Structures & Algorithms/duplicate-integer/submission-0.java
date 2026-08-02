
class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Use a HashSet to track numbers we have already seen
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If the number is already in the set, we found a duplicate
            if (seen.contains(num)) {
                return true;
            }
            // Otherwise, add the number to the set
            seen.add(num);
        }
        
        // If we loop through the entire array without returning true, 
        // there are no duplicates.
        return false;
    }
}