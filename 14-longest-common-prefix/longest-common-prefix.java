class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        String pre = "";
        if (strs == null || size == 0) {
            return pre;
        }

        int i = 1;
        String temp = "";
        int j = 0;
        int k = 0;

        if (size == 1) {
            temp = strs[0];
            return temp.isEmpty() ? "" : String.valueOf(temp.charAt(0));
        }

        while (true) {
            String first = strs[0];

            if (k >= first.length()) {
                break;
            }

            if (i == size) {
                if (j + 1 >= first.length()) {
                    break;
                }
                i = 1;
                j++;
                k++;
            }

            temp = strs[i];

            if (j >= temp.length()) {
                break;
            }

            i++;

            if (temp.charAt(j) == first.charAt(k)) {
                if (i == size) {
                    pre += temp.charAt(j);
                }
            } else {
                break;
            }
        }

        return pre;
    }
}
