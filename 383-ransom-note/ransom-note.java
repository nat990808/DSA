class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean status = true;
        Map<Character, Integer> table = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++)
        {
            char c = magazine.charAt(i);
            table.put(c, table.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++)
        {
            char c = ransomNote.charAt(i);
            if(table.get(c) == null || table.get(c) == 0)
            {
                return false;
            }
            else
            {
                status = true;
                table.put(c, table.get(c) - 1);
            }
        }
        return status;
    }
}