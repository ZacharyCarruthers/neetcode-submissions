class Solution {
    public int[] twoSum(int[] numbers, int target) {

            int left = 0;
            int right = numbers.length - 1;
            int check = 0;
            int[] result = new int[2];

            while(true){

                check = numbers[left] + numbers[right];
            
                if(check > target){
                    right--;
                } else if (check < target){
                    left++;
                } else {
                    result[0] = left+1;
                    result[1] = right+1;
                    return result;
                }
            }
            
    }
}
