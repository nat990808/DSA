class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, j=i, length1 = s.length(), length2 = t.length();
        int subsequenceNumber = 0;
        if(s == null || length2 < length1)
        {
            return false;
        }
        while(true)
        {
            if(i == length1 && subsequenceNumber == length1)
            {
                return true;
            }
            if(j == length2 && subsequenceNumber != length1)
            {
                return false;
            }
            if(s.charAt(i) == t.charAt(j))
            {
                subsequenceNumber++;
                i++;
            }
            j++;
        }
    }
}
