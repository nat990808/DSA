class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Integer> call = new Stack<>();
        int prevTime = 0;  

        for(String log : logs) {
            String[] s = log.split(":");
            int id = Integer.parseInt(s[0]);
            String type = s[1];
            int time = Integer.parseInt(s[2]);

            if(type.equals("start")) {
                if(!call.isEmpty()) {
                    result[call.peek()] += time - prevTime;
                }
                call.push(id);
                prevTime = time; 
            } else { 
                int endedId = call.pop();
                result[endedId] += time - prevTime + 1; 
                prevTime = time + 1; 
            }
        }

        return result;
    }
}
