
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        
        // Business line priority
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);

        List<int[]> validIndexes = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            if (code[i] == null || code[i].isEmpty()) continue;
            if (!isActive[i]) continue;
            if (!priority.containsKey(businessLine[i])) continue;

            String coupon = code[i];
            boolean allCharsValid = true;

            for (int j = 0; j < coupon.length(); j++) {
                char c = coupon.charAt(j);
                if (!((c >= 'A' && c <= 'Z') ||
                      (c >= 'a' && c <= 'z') ||
                      (c >= '0' && c <= '9') ||
                      c == '_')) {
                    allCharsValid = false;
                    break;
                }
            }

            if (allCharsValid) {
                validIndexes.add(new int[]{i});
            }
        }

        // Sort by businessLine priority, then by code
        Collections.sort(validIndexes, (a, b) -> {
            int p1 = priority.get(businessLine[a[0]]);
            int p2 = priority.get(businessLine[b[0]]);
            if (p1 != p2) return p1 - p2;
            return code[a[0]].compareTo(code[b[0]]);
        });

        List<String> result = new ArrayList<>();
        for (int[] idx : validIndexes) {
            result.add(code[idx[0]]);
        }

        return result;
    }
}
