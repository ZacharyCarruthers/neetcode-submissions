class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

            for (int i = 0; i < s.length(); i++) {

                char check = s.charAt(i);

                if (check == '(' || check == '{' || check == '[') {
                    stack.push(check);
                    continue;
                }

                if (stack.isEmpty()) {
                    return false;
                }

                char peek = stack.pop();    

                if (check == ')' && peek != '(') {
                    return false;
                } else if (check == '}' && peek != '{') {
                    return false;
                } else if (check == ']' && peek != '[') {
                    return false;
                }
            }

        return stack.isEmpty();

    }
}
