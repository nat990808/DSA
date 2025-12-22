class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> name = new ArrayList<>();
        int j = 1; 

        for (int i = 0; i < target.length; i++) {
            while (j < target[i]) {
                name.add("Push");
                name.add("Pop");
                j++;
            }
            name.add("Push");
            j++;
        }

        return name;
    }
}
