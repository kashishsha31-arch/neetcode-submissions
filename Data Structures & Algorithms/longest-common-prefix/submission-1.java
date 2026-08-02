class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int n=strs.length;

        for(int i=0;i<strs[0].length();i++)
        {
            char ch=strs[0].charAt(i);//taking first character

            //will compare each character of other strings with this leader string 
            for(int j=1;j<n;j++)
            {
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch)
                {
                    return strs[0].substring(0,i);//mismatch occured so till here only where we previously checked
                }
            }
        }
        return strs[0];
        //we checked without any mismatch 
    }
}