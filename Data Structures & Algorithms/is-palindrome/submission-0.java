class Solution {
    public boolean isPalindrome(String s) {
        
        String check = s.replaceAll("[^a-zA-Z0-9]", "");
        check = check.toLowerCase();

        int k = check.length();

        for(int i = 0; i < check.length(); i++){
            if(check.charAt(i) != check.charAt(k-1)){
                return false;
            }
            k--;
        }
        return true;




    }
}
