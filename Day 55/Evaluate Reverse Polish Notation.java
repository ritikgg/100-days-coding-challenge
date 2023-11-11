class Solution {
    private static final Set<String> operators = new HashSet<>(Set.of("+", "-", "/","*"));

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for( String token  : tokens){
            if(!operators.contains(token)){
                stack.push(Integer.parseInt(token));
            }
            else{
                int b = stack.pop();
                int a = stack.pop();

                if(token.equals("+")){
                    stack.push(a + b);
                }
                else if(token.equals("-")){
                    stack.push(a-b);
                }
                else if(token.equals("*")){
                    stack.push(a * b);
                }
                else {
                    stack.push(a/b);
                }
            }

        }
        return stack.pop();  
    }
}
