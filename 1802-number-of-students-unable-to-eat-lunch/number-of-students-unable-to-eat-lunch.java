class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue <Integer> stu = new LinkedList<>();
        Queue <Integer> sand = new LinkedList<>();
        for (int s : students) stu.add(s);
        for (int s : sandwiches) sand.add(s);
        int rotation = 0;
        while(!stu.isEmpty() && rotation <= stu.size())
        {
            if(!stu.peek().equals(sand.peek()))
            {
                stu.add(stu.poll());
                rotation++;
            }
            else{
                stu.poll();
                sand.poll();
                rotation = 0;
            }
        }
        int size = stu.size();    
        return size;
    }
}