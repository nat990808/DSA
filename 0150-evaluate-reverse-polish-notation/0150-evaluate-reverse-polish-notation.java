class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int temp = 0;
        for(int i = 0; i < tokens.length; i++) {
            switch(tokens[i]) {
                case "+":
                    int b = stack.pop();
                    int a = stack.pop();
                    temp = a + b;
                    stack.push(temp);
                    temp = 0;
                    break;
                case "-":
                    b = stack.pop();
                    a = stack.pop();
                    temp = a - b;
                    stack.push(temp);
                    temp = 0;
                    break;
                case "*":
                    b = stack.pop();
                    a = stack.pop();
                    temp = a * b;
                    stack.push(temp);
                    temp = 0;
                    break;
                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    temp = a / b;
                    stack.push(temp);
                    temp = 0;
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }

        return stack.pop();
    }
}
