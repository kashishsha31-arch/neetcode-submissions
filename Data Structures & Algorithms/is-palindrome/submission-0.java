class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            char start = s.charAt(i);
            char end = s.charAt(j);
            
            // If the character at 'i' is not a letter or digit, skip it
            if (!Character.isLetterOrDigit(start)) {
                i++;
            } 
            // If the character at 'j' is not a letter or digit, skip it
            else if (!Character.isLetterOrDigit(end)) {
                j--;
            } 
            // Both are valid alphanumeric characters, compare them case-insensitively
            else {
                if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        
        return true;
    }
}